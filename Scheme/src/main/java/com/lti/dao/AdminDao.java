package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.lti.entity.Claim;

@Repository
public class AdminDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public List<Claim> fetchClaims(){
		String jpql="select c from Claim c";
		Query q = entityManager.createQuery(jpql);
		return q.getResultList();
		
	}
}
