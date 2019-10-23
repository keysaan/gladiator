package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.dto.LoginDto;
import com.lti.service.LoginService;

@Controller
@SessionAttributes("user")
public class LoginController{

	@Autowired
	private LoginService loginService;
	@RequestMapping(path="/login.lti" , method = RequestMethod.GET)
	public String login(LoginDto data, Map model) throws ClassNotFoundException {
				
		data.getEmailId();
		data.getPassword();
		String role=data.getUser();
		Object o=loginService.login(data);
		//System.out.println(o.toString());
		//System.out.println(o.getClass());
		//System.out.println(Farmer.class);
		//Class c=o.getClass();
		//System.out.println(c.getName());
		//System.out.println(data.getUser());
		model.put("user",o.toString());
		if(role.equals("Farmer")){
			return "farmerdashboard.jsp";
		}
		else
			if(role.equals("Bidder")){
				return "yeslogin.jsp";
			}
			else
				if(role.equals("Admin")){
					return "admindasboard.jsp";
				}
		return "login.jsp";
	}
	}
