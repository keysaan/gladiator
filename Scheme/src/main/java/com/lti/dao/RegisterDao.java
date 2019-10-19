package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("registerDao")
public class RegisterDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void addFarmer(Object obj) {
		entityManager.persist(obj);
	}

}
