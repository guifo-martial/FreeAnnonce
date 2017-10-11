package com.application.FreeAnnonce.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="LOCATION")
public class Location implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4845511683482056032L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PK_LOCATION")
	protected int pkLocation ;
	@Column(name = "LATITUDE", nullable = false, length = 100)
	protected Long lattitude ;
	@Column(name = "LONGITUDE", nullable = false, length = 100)
	protected Long longitude;
	@OneToOne(mappedBy="location")
	@JoinColumn(name = "USER_ID")
	protected Add add;

	public Location() {
		
	}

	public Location( Long lattitude, Long longitude) {
		this.lattitude = lattitude;
		this.longitude = longitude;
	}

	/**
	 * @return the pkLocation
	 */
	public int getPkLocation() {
		return pkLocation;
	}

	/**
	 * @param pkLocation the pkLocation to set
	 */
	public void setPkLocation(int pkLocation) {
		this.pkLocation = pkLocation;
	}

	/**
	 * @return the lattitude
	 */
	public Long getLattitude() {
		return lattitude;
	}

	/**
	 * @param lattitude the lattitude to set
	 */
	public void setLattitude(Long lattitude) {
		this.lattitude = lattitude;
	}

	/**
	 * @return the longitude
	 */
	public Long getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}
	
	

	/**
	 * @return the add
	 */
	public Add getAdd() {
		return add;
	}

	/**
	 * @param add the add to set
	 */
	public void setAdd(Add add) {
		this.add = add;
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
