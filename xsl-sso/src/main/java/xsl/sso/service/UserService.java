package xsl.sso.service;

import org.springframework.stereotype.Service;

import com.xsl.pojo.User;

import xsl.common.pojo.XslResult;

@Service
public interface UserService {
	public XslResult checkData(String content, Integer type);
	public XslResult createUser(User user);
	public XslResult userLogin(String username, String password); 
	public XslResult getUserByToken(String token);
}
