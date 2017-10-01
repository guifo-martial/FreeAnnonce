package com.application.FreeAnnonce.com.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PROPERTY_ADDS")
public class Property extends Add {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4016706996504262224L;
	
	@Column(name = "SURFACE", nullable = false, length = 100)
	protected Double surface;
	@Column(name = "ROOMS", nullable = false, length = 100)
	protected int rooms;
	
	@OneToOne
	@JoinColumn(name="PROP_TYPE_ID")
	protected Property_Type propType;
	
	

	

	public Property() {
		// TODO Auto-generated constructor stub
	}

	public Property(String title, String description, String addType, Double price, Date creationDate) {
		super(title, description, addType, price, creationDate);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the propType
	 */
	public Property_Type getPropType() {
		return propType;
	}

	/**
	 * @param propType the propType to set
	 */
	public void setPropType(Property_Type propType) {
		this.propType = propType;
	}

	/**
	 * @return the surface
	 */
	public Double getSurface() {
		return surface;
	}

	/**
	 * @param surface the surface to set
	 */
	public void setSurface(Double surface) {
		this.surface = surface;
	}

	/**
	 * @return the rooms
	 */
	public int getRooms() {
		return rooms;
	}

	/**
	 * @param rooms the rooms to set
	 */
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	/* (non-Javadoc)
	 * @see com.application.freeAnnonce.entities.Add#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
