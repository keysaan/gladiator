package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_SOLD_CROP")
public class SoldCrop {
	
	@Id
	@GeneratedValue
	@Column(name="SOLD_ID")
	private int soldId;
	
    @OneToOne
    @JoinColumn(name="BIDDER_ID")
	private Bidder bidder;
    
	@OneToOne
	@JoinColumn(name="SELL_ID")
	private SellRequest sellRequest;

	public int getSoldId() {
		return soldId;
	}

	public void setSoldId(int soldId) {
		this.soldId = soldId;
	}

	public Bidder getBidder() {
		return bidder;
	}

	public void setBidder(Bidder bidder) {
		this.bidder = bidder;
	}

	public SellRequest getSellRequest() {
		return sellRequest;
	}

	public void setSellRequest(SellRequest sellRequest) {
		this.sellRequest = sellRequest;
	}

	
	
	

}
