package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lti.dao.SellRequestDao;
import com.lti.entity.SellRequest;

@Service("sellRequestService")
public class SellRequestService {
	
	@Autowired
	private SellRequestDao sellRequestDao;
	
	public void sellRequest(SellRequest sellRequest) {
		
		sellRequestDao.addSellRequest(sellRequest);	
	}

}
