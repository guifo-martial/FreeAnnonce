package com.application.FreeAnnonce.entities;

import java.io.Serializable;

public class City implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 63899587179626285L;

	protected int pkCity ;
	protected String name ;
	
	public City() {
		
	}

	public City(String name) {
		this.name = name;
	}

	/**
	 * @return the pkCity
	 */
	public int getPkCity() {
		return pkCity;
	}

	/**
	 * @param pkCity the pkCity to set
	 */
	public void setPkCity(int pkCity) {
		this.pkCity = pkCity;
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
