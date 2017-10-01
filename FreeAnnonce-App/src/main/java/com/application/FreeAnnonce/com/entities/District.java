package com.application.FreeAnnonce.com.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="DISTRICT")
public class District implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2230295297046079774L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	@Column(name="PK_DISTRICT")
	protected int pkDistrict ;
	@Column(name = "DISTRICT", nullable = false, length = 100)
	protected String district ;
	
	public District() {
		
	}

	public District(String district) {
		this.district = district;
	}

	/**
	 * @return the pkDistrict
	 */
	public int getPkDistrict() {
		return pkDistrict;
	}

	/**
	 * @param pkDistrict the pkDistrict to set
	 */
	public void setPkDistrict(int pkDistrict) {
		this.pkDistrict = pkDistrict;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
