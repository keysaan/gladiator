package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Farmer;
import com.lti.entity.Bidder;
import com.lti.entity.Admin;
import com.lti.dto.LoginDto;
import com.lti.service.LoginService;
///
@Repository("loginDao")
public class LoginDao {

	@Autowired
	private LoginService loginService;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public boolean login(LoginDto data) throws ClassNotFoundException{
		String clazz="import com.lti.entity."+data.getUser();
		System.out.println(data.getUser());
		
		Class c=Class.forName(clazz);
		String jpql="select o from c o where o.emailId=:email and o.password=:psw";
		Query q=entityManager.createQuery(jpql);
		q.setParameter("email", data.getEmailId());
		q.setParameter("psw", data.getPassword());
		if(q.getSingleResult()!=null)
			return true;
		else
			return false;
		
			
	}
	
}
