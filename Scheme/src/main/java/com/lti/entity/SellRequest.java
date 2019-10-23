package com.lti.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TBL_SELL_REQUEST")
public class SellRequest {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE1")
	@SequenceGenerator(name="SEQUENCE1",sequenceName="sellrequest_seq", allocationSize=1)
	@Column(name="SELL_ID")
	private int sellId;
	
	@Column(name="BASE_VALUE")
	private double baseValue;
	
	@Column(name="QUANTITY")
	private double quantity;
	
	@Column(name="BID_DEADLINE")
	private Date bidDeadLine;
	
	@Column(name="SOIL_PH_CERTIFICATE")
	private String soilPhCertificate;
	
	@ManyToOne
	@JoinColumn(name="FARMER_ID")
	private Farmer farmer;
	
	@ManyToOne
	@JoinColumn(name="CROP_ID")
	private Crop crop;

	public int getSellId() {
		return sellId;
	}

	public void setSellId(int sellId) {
		this.sellId = sellId;
	}

	public double getBaseValue() {
		return baseValue;
	}

	public void setBaseValue(double baseValue) {
		this.baseValue = baseValue;
	}

	public Date getBidDeadLine() {
		return bidDeadLine;
	}

	public void setBidDeadLine(Date deadLine) {
		this.bidDeadLine = deadLine;
	}

	public String getSoilPhCertificate() {
		return soilPhCertificate;
	}

	public void setSoilPhCertificate(String soilPhCertificate) {
		this.soilPhCertificate = soilPhCertificate;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

	public Crop getCrop() {
		return crop;
	}

	public void setCrop(Crop crop) {
		this.crop = crop;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	
}
