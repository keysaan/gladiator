package com.lti.dao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.entity.SellRequest;
import com.lti.interfaces.SellRequestInterface;

@Repository("sellrequestDao")
public class SellRequestDao {
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public void addSellRequest(SellRequest sellRequest) {
		entityManager.persist(sellRequest);
		
		
	}

}	


