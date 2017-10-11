package com.application.FreeAnnonce.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PROPERTY_TYPE")
public class Property_Type implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5649559903479318289L;
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	@Column(name="PK_DISTRICT")
	protected int pkPropType ;
	@Column(name = "NAME", nullable = false, length = 100)
	protected String name ;
	

	public Property_Type() {
		
	}


	public Property_Type(String name) {
		this.name = name;
	}




	/**
	 * @return the pkPropType
	 */
	public int getPkPropType() {
		return pkPropType;
	}


	/**
	 * @param pkPropType the pkPropType to set
	 */
	public void setPkPropType(int pkPropType) {
		this.pkPropType = pkPropType;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
