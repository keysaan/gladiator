package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.AdminDao;
import com.lti.entity.Claim;

@Service
public class AdminService {

	@Autowired
	private AdminDao adminDao;
	
	public List<Claim> fetchClaims(){
		List<Claim> claims=adminDao.fetchClaims();
		return claims;
	}
	
//	public List<SoldCrop> fetchSoldBid(){
//		List<SoldCrop> soldBids=adminDao.fetchSoldBid();
//	}
//	
}
