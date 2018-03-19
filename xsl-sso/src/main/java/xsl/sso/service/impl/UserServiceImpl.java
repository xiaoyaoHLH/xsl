package xsl.sso.service.impl;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xsl.mapper.UserMapper;
import com.xsl.pojo.User;
import com.xsl.pojo.UserExample;
import com.xsl.pojo.UserExample.Criteria;

import xsl.common.pojo.XslResult;
import xsl.sso.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	
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
		
		return XslResult.ok(token);

	}

	@Override
	public XslResult getUserByToken(String token) {
		
		
		return null;
	}

}
