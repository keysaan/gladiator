package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.lti.dto.LoginDto;
import com.lti.entity.Admin;
import com.lti.entity.Bidder;
import com.lti.entity.Farmer;

///
@Repository("loginDao")
public class LoginDao {

		
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public Object login(LoginDto data) throws ClassNotFoundException{
		
		//System.out.println("import com.lti.entity."+data.getUser());
		
		//Class c=Class.forName("import com.lti.entity."+data.getUser());
		String jpql="select firstName from "+Class.forName("com.lti.entity."+data.getUser()).getName() +" o where o.emailId=:email and o.password=:psw";
		//Select a.adminName,a.adminEmail from AdminInfo a where a.adminEmail = :email AND a.adminPassword=:password
		//String jpql="select o.emailId,o.password from Farmer o where o.emailId= :email and o.password= :psw";
		Query q=entityManager.createQuery(jpql);
		q.setParameter("email", data.getEmailId());
		q.setParameter("psw", data.getPassword());
		//Object o=Class.forName("com.lti.entity."+data.getUser());
		return q.getSingleResult();
		
		
					
	}
	
}
