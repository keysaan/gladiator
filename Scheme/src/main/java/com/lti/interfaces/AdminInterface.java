package com.lti.interfaces;

import java.util.List;

import com.lti.entity.Claim;

public interface AdminInterface {

	public List<Claim> fetchClaims();
	//public List<SoldBids> fetchSoldBids();
}
