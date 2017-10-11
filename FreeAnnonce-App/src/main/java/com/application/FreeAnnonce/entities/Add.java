package com.application.FreeAnnonce.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Add implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -273602407090864727L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="PK_ADD")
	protected int pkAdd ;
	@Column(name = "TITLE", nullable = false, length = 100)
	protected String title;
	@Column(name = "DESCRIPTION", nullable = false, length = 100)
	protected String description;
	@Column(name = "ADD_TYPE", nullable = false, length = 100)
	protected String addType;
	@Column(name = "PRICE", nullable = false, length = 100)
	protected Double price;
	@Column(name = "CREATION_DATE", nullable = false, length = 100)
	protected Date CreationDate;
	
	@ManyToOne
	protected User user;
	
	@OneToOne
	@JoinColumn(name="LOCATION_ID")
	protected Location location;
	
	@OneToMany(mappedBy="add",fetch=FetchType.LAZY)
	protected Set<Photo> photo;
	@Column(name = "DISTRICT_ID", nullable = false, length = 100)
	protected District district;



	public Add() {
		
	}
	

	public Add(String title, String description, String addType, Double price, Date creationDate) {
		this.title = title;
		this.description = description;
		this.addType = addType;
		this.price = price;
		CreationDate = creationDate;
	}


	/**
	 * @return the pkAdd
	 */
	public int getPkAdd() {
		return pkAdd;
	}

	/**
	 * @param pkAdd the pkAdd to set
	 */
	public void setPkAdd(int pkAdd) {
		this.pkAdd = pkAdd;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the addType
	 */
	public String getAddType() {
		return addType;
	}

	/**
	 * @param addType the addType to set
	 */
	public void setAddType(String addType) {
		this.addType = addType;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return CreationDate;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		CreationDate = creationDate;
	}
	
	
	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}


	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}





	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}


	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}


	/**
	 * @return the photo
	 */
	public Set<Photo> getPhoto() {
		return photo;
	}


	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(Set<Photo> photo) {
		this.photo = photo;
	}


	/**
	 * @return the district
	 */
	public District getDistrict() {
		return district;
	}


	/**
	 * @param district the district to set
	 */
	public void setDistrict(District district) {
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
