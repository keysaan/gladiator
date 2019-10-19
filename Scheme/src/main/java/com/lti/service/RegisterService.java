package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.RegisterDao;
import com.lti.entity.Address;
import com.lti.entity.Farmer;

@Service
public class RegisterService {

	@Autowired
	private RegisterDao registerDao;
	
	public void register(Farmer farmer) {
		
		registerDao.addFarmer(farmer);	
	}
}
