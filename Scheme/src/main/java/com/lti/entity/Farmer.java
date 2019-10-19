package com.lti.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="FARMER_DETAILS")
public class Farmer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE1")
	@SequenceGenerator(name="SEQUENCE1",sequenceName="farmer_seq", allocationSize=1, )
	@Column(name="FARMER_ID")
	private int id;
	
	@Column(name="FARMER_FIRSTNAME")
	private String firstName;
	
	@Column(name="FARMER_LASTNAME")
	private String lastName;
	
	@Column(name="FARMER_CONTACTNO")
	private int contactNo;
	
	@Column(name="FARMER_EMAILID")
	private String emailId;
	
	@Column(name="FARMER_ACCOUNT_NO")
	private int accountNo;
	
	@Column(name="FARMER_AADHARCARD")
	private String aadharCard;
	
	@Column(name="FARMER_PANCARD")
	private String panCard;
	
	@Column(name="FARMER_PASSWORD")
	private String password;
	
	@OneToOne
	@JoinColumn(name="ADDRESS_ID")
	private Address address;
//	private List<SellRequest> sellRequests;
	
	@OneToOne
	@JoinColumn(name="BANK_DETAILS")
	private BankDetails bankDetails;

	@OneToMany(mappedBy="farmer")
	private List<Crop> crop;
	
	
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
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
//	public List<SellRequest> getSellRequests() {
//		return sellRequests;
//	}
//	public void setSellRequests(List<SellRequest> sellRequests) {
//		this.sellRequests = sellRequests;
//	}
	public BankDetails getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	public List<Crop> getCrop() {
		return crop;
	}
	public void setCrop(List<Crop> crop) {
		this.crop = crop;
	}

}
