package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TBL_CROP_DETAILS")
public class Crop {
	
	@Id
	@GeneratedValue
	@SequenceGenerator(name="crop_id_seq", initialValue=16, allocationSize= 1)
	@Column(name="CROP_ID")
	private int cropId;
	
	@Column(name="CROP_NAME")
	private String cropName;
	
	@Column(name="FERTILIZER_TYPE")
	private String fertilizerType;
	
	@Column(name="SOIL_PH")
	private float soilPh;
	
	@ManyToOne
	@JoinColumn(name="FARMER_ID")
	private Farmer farmer;
	
	@OneToOne
	@JoinColumn(name="CROP_TYPE_ID")
	private CropType cropType;
		
}
