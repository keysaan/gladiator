package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Farmer;

@Repository
public class RegisterDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void addFarmer(Farmer farmer) {
		entityManager.merge(farmer);
	}

}
