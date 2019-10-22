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
	
	public boolean login(LoginDto data) {
		System.out.println(data.getUser());
		boolean status=false;
		try {
			status = loginDao.login(data);
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;	
	}
}
