package com.lti.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CLAIM_DETAILS")
public class Claim {
	
	@Id
	@GeneratedValue
	@Column(name="CLAIM_ID")
	private  int claimId;

	
	@Column(name="CAUSE_OF_LOSS")
	private String causeOfLoss;
	
	@Column(name="DATE_OF_LOSS")
	private Date dateOfLoss;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="FARMER_ID")
	private Farmer farmer;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="INSURANCE_ID")
	private Insurance insurance;
	
	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}


	public String getCauseOfLoss() {
		return causeOfLoss;
	}

	public void setCauseOfLoss(String causeOfLoss) {
		this.causeOfLoss = causeOfLoss;
	}

	public Date getDateOfLoss() {
		return dateOfLoss;
	}

	public void setDateOfLoss(Date dateOfLoss) {
		this.dateOfLoss = dateOfLoss;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}
	
	
	

}
