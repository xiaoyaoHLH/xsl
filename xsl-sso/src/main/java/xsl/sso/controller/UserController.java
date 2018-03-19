package xsl.sso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xsl.pojo.User;

import xsl.common.pojo.XslResult;
import xsl.common.utils.ExceptionUtil;
import xsl.sso.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/register")
	public XslResult createUser(User user){
		try {
			XslResult result = userService.createUser(user);
			return result;
			
		} catch (Exception e) {
			return XslResult.build(500, ExceptionUtil.getStackTrace(e));
		
		}
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	@ResponseBody
	public XslResult userLogin(String username, String password) {
		try {
			
			XslResult result = userService.userLogin(username, password);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return XslResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	
	
	
	
	
}
