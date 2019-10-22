package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.LoginDao;
import com.lti.dto.LoginDto;
import com.lti.entity.Farmer;
///
@Service
public class LoginService {

	@Autowired
	private LoginDao loginDao;
	
	public Object login(LoginDto data) {
	Object o = null;
	try {
		o = loginDao.login(data);
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return o;
	
	}
}