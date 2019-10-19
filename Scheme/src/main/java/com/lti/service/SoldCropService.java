package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.SoldCropDao;
import com.lti.entity.SellRequest;

@Service
public class SoldCropService {
	
	@Autowired
	private SoldCropDao soldCropDao;
	
	public List<SellRequest> fetchSellRequests(){
		List<SellRequest> sellrequest=soldCropDao.fetchSellRequests();
		return sellrequest;
		
	}
}
