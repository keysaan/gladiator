package com.lti.dto;

import java.util.Date;

public class SellRequestDto {

	private double baseValue;
	private String soilPhCertificate;
	private String bidDeadline;
	private String cropId;
	private String quantity;
	
	
	public double getBaseValue() {
		return baseValue;
	}
	public void setBaseValue(double baseValue) {
		this.baseValue = baseValue;
	}
	
	public String getSoilPhCertificate() {
		return soilPhCertificate;
	}
	public void setSoilPhCertificate(String soilPhCertificate) {
		this.soilPhCertificate = soilPhCertificate;
	}
	
	public String getCropId() {
		return cropId;
	}
	public void setCropId(String cropId) {
		this.cropId = cropId;
	}
	public String getBidDeadline() {
		return bidDeadline;
	}
	public void setBidDeadline(String bidDeadline) {
		this.bidDeadline = bidDeadline;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
		
}
