package com.application.FreeAnnonce.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="PHOTO")
public class Photo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4677149374882444577L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PK_PHOTO")
	protected int pkphoto ;
	@Column(name = "URL", nullable = false, length = 100)
	protected String url ;
	
	@ManyToOne
	protected Add add;
	
	public Photo() {
		
	}

	public Photo(String url) {
		this.url = url;
	}

	/**
	 * @return the pkphoto
	 */
	public int getPkphoto() {
		return pkphoto;
	}

	/**
	 * @param pkphoto the pkphoto to set
	 */
	public void setPkphoto(int pkphoto) {
		this.pkphoto = pkphoto;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
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
