package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

import org.springframework.stereotype.Repository;



@Repository
public class SoldCropDao<SellRequest> {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public List<SellRequest> fetchSellRequests(){
		String jpql="select r from SellRequest r ";
		Query q = entityManager.createQuery(jpql);
		return q.getResultList();
	}
	
}
