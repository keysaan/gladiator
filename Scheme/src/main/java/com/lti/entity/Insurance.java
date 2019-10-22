package com.lti.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="TBL_INSURANCE")
public class Insurance {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE1")
	@SequenceGenerator(name="SEQUENCE1",sequenceName="insurance_seq", allocationSize=1)
	@Column(name="INSURANCE_ID")
	private int insuranceId;
	
	@Column(name="FIELD_AREA")
	private int fieldArea;
	

	@Column(name="CROP_STATUS")
	private String cropStatus;
	
	@Column(name="CROP_SEASON")
	private String cropSeason;
	
	@Column(name="YEAR")
	private Date year;
	
	@Column(name="SUM_INSURED")
	private int sumInsured;
	
	@Column(name="STATUS")
	private String status;
	
   @ManyToOne 
   @JoinColumn(name="CROP_ID")
   private Crop crop;
   
   @OneToOne
   @JoinColumn(name="FARMER_ID")
   private Farmer farmer;

   @OneToOne(mappedBy="insurance")
   private Claim claim;

public int getInsuranceId() {
	return insuranceId;
}


public void setInsuranceId(int insuranceId) {
	this.insuranceId = insuranceId;
}


public int getFieldArea() {
	return fieldArea;
}


public void setFieldArea(int fieldArea) {
	this.fieldArea = fieldArea;
}


public String getCropStatus() {
	return cropStatus;
}


public void setCropStatus(String cropStatus) {
	this.cropStatus = cropStatus;
}


public String getCropSeason() {
	return cropSeason;
}


public void setCropSeason(String cropSeason) {
	this.cropSeason = cropSeason;
}


public Date getDate() {
	return year;
}


public void setDate(Date date) {
	this.year = year;
}


public int getSumInsured() {
	return sumInsured;
}


public void setSumInsured(int sumInsured) {
	this.sumInsured = sumInsured;
}


public String getStatus() {
	return status;
}


public void setStatus(String status) {
	this.status = status;
}


public Crop getCrop() {
	return crop;
}


public void setCrop(Crop crop) {
	this.crop = crop;
}


public Farmer getFarmer() {
	return farmer;
}


public void setFarmer(Farmer farmer) {
	this.farmer = farmer;
}
	
   

}
