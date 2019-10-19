package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.entity.Claim;
import com.lti.entity.SellRequest;
import com.lti.entity.SoldCrop;
import com.lti.service.SoldCropService;

@Controller
public class SoldCropController {

	@Autowired
	private SoldCropService cropService;
	 
	@RequestMapping(path="/soldCrop.lti", method=RequestMethod.GET)
	public String fetchSoldData(SoldCrop soldCrop,Map model){
		List<SellRequest> sellrequest=cropService.fetchSellRequests();
		model.put("listofsoldcrops", sellrequest);
	  	return "displaysoldcrop.jsp";
	} 
}
