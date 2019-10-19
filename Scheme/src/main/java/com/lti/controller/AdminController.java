package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.entity.Claim;
import com.lti.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@RequestMapping(path="/admin.lti", method=RequestMethod.GET)
	public String fetchClaim(Claim claim,Map model){
		List<Claim> claims=adminService.fetchClaims();
		model.put("listofclaims", claims);
	  	return "displayclaims.jsp";
	}
	
	
}
