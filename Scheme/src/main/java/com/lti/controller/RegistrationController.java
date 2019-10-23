package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.dto.RegisterDto;
import com.lti.entity.Address;
import com.lti.entity.BankDetails;
import com.lti.entity.Farmer;
import com.lti.service.RegisterService;
//
@Controller
public class RegistrationController {
		
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(path="/register.lti" , method = RequestMethod.POST)
	public String register(RegisterDto data, Map model){
		
		Farmer f = new Farmer();
		f.setFirstName(data.getFirstname());
		f.setLastName(data.getLastname());
		f.setEmailId(data.getEmailId());
		f.setContactNo(data.getContactno());
		f.setAadharCard(data.getAadharCard());
		f.setPanCard(data.getPanCard());
		f.setPassword(data.getPassword());
		
		Address a = new Address();
		a.setAddr(data.getAddr());
		a.setCity(data.getCity());
		a.setState(data.getState());
		a.setPincode(data.getPincode());
		
		f.setAddress(a);
		a.setFarmer(f);
		
		BankDetails b = new BankDetails();
		b.setIfscNo(data.getIfscNo());
		
		f.setBankDetails(b);
		b.setFarmer(f);
		registerService.register(f);
		
		return "confirmation.jsp";
	}
}
