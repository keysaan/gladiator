package com.lti.dao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.entity.SellRequest;
import com.lti.interfaces.SellRequestInterface;

@Repository("sellrequestDao")
public class SellRequestDao  implements SellRequestInterface{
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public void addSellRequest(SellRequest sellRequest) {
		entityManager.persist(sellRequest);
		
	}

	public void removeSellRequest(SellRequest sellRequest) {
		entityManager.remove(sellRequest);	
	}
}	


