package com.lti.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.service.LoginService;

@Repository("loginDao")
public class LoginDao {

	@Autowired
	private LoginService loginService;
}
