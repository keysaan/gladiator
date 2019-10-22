package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.dto.LoginDto;
import com.lti.entity.Farmer;
import com.lti.service.LoginService;

@Controller
@SessionAttributes("user")
public class LoginController{

	@Autowired
	private LoginService loginService;
	@RequestMapping(path="/login.lti" , method = RequestMethod.GET)
	public String login(LoginDto data, Map model) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		//Farmer f = new Farmer();
		data.getEmailId();
		data.getPassword();
		/*Class c=Class.forName(data.getUser());
		Object o=c.newInstance();*/
		System.out.println(data.getUser());
		
		Object obj=(Object)loginService.login(data);
		if(obj!=null){
			model.put("user", obj);
			return "yeslogin.jsp";
		}
		else
			return "login.jsp";
	}
	}
