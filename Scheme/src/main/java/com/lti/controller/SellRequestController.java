package com.lti.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.dao.GenericDao;
import com.lti.dto.SellRequestDto;
import com.lti.entity.Crop;
import com.lti.entity.Farmer;
import com.lti.entity.SellRequest;
import com.lti.service.SellRequestService;

@Controller
public class SellRequestController {
	
	@Autowired
	public SellRequestService sellRequestService;
	@Autowired
	public GenericDao  dao;
	@RequestMapping(path="/sellrequest.lti" , method = RequestMethod.POST)
	public String SellRequest(SellRequestDto data, Map model){
		try {
		SimpleDateFormat formatter1=new SimpleDateFormat("YYYY-MM-DD");  
		Date date1 = formatter1.parse(data.getBidDeadline());
		
			SellRequest sr = new SellRequest();
			sr.setBaseValue(data.getBaseValue());
			sr.setBidDeadLine(date1);
			sr.setSoilPhCertificate(data.getSoilPhCertificate());
			sr.setQuantity(Integer.parseInt(data.getQuantity()));
			Crop c = new Crop();
			c.setCropId(Integer.parseInt(data.getCropId()));
			Farmer f = new Farmer();
			f.setId(1001);
			
			sr.setCrop(c);
			sr.setFarmer(f);
			sellRequestService.sellRequest(sr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
			return "sellrequest.jsp";
		
			
	}			
}
