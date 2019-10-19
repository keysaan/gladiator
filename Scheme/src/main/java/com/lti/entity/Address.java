package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
 
	@Id
	@GeneratedValue
	@Column(name= "ADDRESS_ID")
	private int id;
	
	@Column(name= "ADDRESSLINE1")
	private String addr;
	
	@Column(name= "CITY")
	private String city;
	
	@Column(name= "STATE")
	private String state;
	
	@Column(name= "PINCODE")
	private int pincode;
	
	@OneToOne(mappedBy="address")
	private Farmer farmer;
	
	@OneToOne(mappedBy="address")
	private Bidder bidder;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

	public Bidder getBidder() {
		return bidder;
	}

	public void setBidder(Bidder bidder) {
		this.bidder = bidder;
	}
	
}
