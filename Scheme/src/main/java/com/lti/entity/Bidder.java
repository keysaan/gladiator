package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="BIDDER_DETAILS")
public class Bidder{

	@Id
	@GeneratedValue	
	@SequenceGenerator(name="bidder_id_seq", initialValue=2005, allocationSize= 1)
	@Column(name="BIDDER_ID")
	private int id;
	
	@Column(name="BIDDER_FIRSTNAME")
	private String firstName;
	
	@Column(name="BIDDER_LASTNAME")
	private String lastName;
	
	@Column(name="BIDDER_CONTACTNO")
	private int contactNo;
	
	@Column(name="BIDDER_EMAILID")
	private String emailId;
	
	@Column(name="BIDDER_PASSWORD")
	private String password;
	
	@Column(name="BIDDER_LICENSENO")
	private String licenseNo;
	
	@Column(name="BIDDER_AADHARCARD")
	private String aadharCard;
	
	@Column(name="BIDDER_PANCARD")
	private String panCard;
	
	@OneToOne
	@JoinColumn(name="ADDRESS_ID")
	private Address address;
	

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
