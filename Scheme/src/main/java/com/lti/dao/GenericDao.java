package com.lti.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository("genericDao")
public class GenericDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void add(Object obj){
		entityManager.merge(obj);
	}
	
	public Object fetchById(Class clazz , Object pk){
		return entityManager.find(clazz, pk);	
	}
	
//	public List<E> fetchAll(Class clazz){
//		String jpql ="";
//		return entityManager.createQuery(jpql , clazz).getResultList();
//	}
//	
	
}
