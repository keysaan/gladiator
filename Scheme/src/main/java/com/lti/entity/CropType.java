package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_CROP_TYPE")
public class CropType {
    
	@Id
	@GeneratedValue
	@Column(name="CROP_TYPE_ID")
	private int cropTypeId;
	
	@Column(name="CROP_TYPE_NAME")
	private String cropTypeName;

	public int getCropTypeId() {
		return cropTypeId;
	}

	public void setCropTypeId(int cropTypeId) {
		this.cropTypeId = cropTypeId;
	}

	public String getCropTypeName() {
		return cropTypeName;
	}

	public void setCropTypeName(String cropTypeName) {
		this.cropTypeName = cropTypeName;
	}
}
