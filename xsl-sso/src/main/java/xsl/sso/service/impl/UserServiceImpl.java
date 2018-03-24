package xsl.sso.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.xsl.mapper.UserMapper;
import com.xsl.pojo.User;
import com.xsl.pojo.UserExample;
import com.xsl.pojo.UserExample.Criteria;

import xsl.common.pojo.XslResult;
import xsl.common.utils.JsonUtils;
import xsl.sso.dao.JedisClient;
import xsl.sso.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private JedisClient jedisClient;
	@Value("${REDIS_USER_SESSION_KEY}")
	private String REDIS_USER_SESSION_KEY;
	@Value("${SSO_SESSION_EXPIRE}")
	private Integer SSO_SESSION_EXPIRE;
	
	
	@Override
	public XslResult checkData(String content, Integer type) {
		UserExample example = new UserExample();
		
		Criteria criteria = example.createCriteria();
		
		if(1 == type){
			criteria.andNameEqualTo(content);
		}else if (2 == type) {
			criteria.andPhoneEqualTo(content);
		}
		
		List<User> list = userMapper.selectByExample(example);
		
		if (list == null || list.size() == 0) {
			return XslResult.ok(true);
		}
		return XslResult.ok(false);

	}

	@Override
	public XslResult createUser(User user) {
		user.setCreateTime(new Date().toString());
		user.setPassword(DigestUtils.md5Hex(user.getPassword().getBytes()));
		
		userMapper.insert(user);
		
		return XslResult.ok();
	}

	@Override
	public XslResult userLogin(String username, String password) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(username);
		
		List<User> list = userMapper.selectByExample(example);
		
		if(list == null || list.size() == 0){
			return XslResult.build(400, "用户名或密码错误");
		}
		
		User user = list.get(0);
		
		if(!DigestUtils.md5Hex(password.getBytes()).equals(user.getPassword())){
			return XslResult.build(400, "用户名或密码错误");
		}
		
		String token = UUID.randomUUID().toString();
		
		user.setPassword(null);
		
		//把用户信息写入redis
		jedisClient.set(REDIS_USER_SESSION_KEY + ":" + token, JsonUtils.objectToJson(user));
		//设置session的过期时间
		jedisClient.expire(REDIS_USER_SESSION_KEY + ":" + token, SSO_SESSION_EXPIRE);

		return XslResult.ok(token);

	}

	@Override
	public XslResult getUserByToken(String token) {
		String json = jedisClient.get(REDIS_USER_SESSION_KEY+":"+token);
		
		if(StringUtils.isBlank(json)){
			return XslResult.build(400, "此session已经过期，请重新登录");
		}
		
		jedisClient.expire(REDIS_USER_SESSION_KEY+":"+token, SSO_SESSION_EXPIRE);
		
		return XslResult.ok(JsonUtils.jsonToPojo(json, User.class));
	}

}
