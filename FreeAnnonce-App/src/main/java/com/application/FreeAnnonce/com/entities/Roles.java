package com.application.FreeAnnonce.com.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="ROLES")
public class Roles implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2489204247782933639L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PK_ROLES")
	protected int pkRole;
	@Column(name = "NAME", nullable = false, length = 100)
	protected String name;
	@Column(name = "DESCRIPTION", nullable = false, length = 100)
	protected String description;
	
	@ManyToMany(mappedBy="roles")
	protected Set<Account> account;
	


	public Roles() {
		
	}

	

	public Roles( String name, String description) {
		this.name = name;
		this.description = description;
	}



	/**
	 * @return the pkRole
	 */
	public int getPkRole() {
		return pkRole;
	}



	/**
	 * @param pkRole the pkRole to set
	 */
	public void setPkRole(int pkRole) {
		this.pkRole = pkRole;
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
	 * @return the account
	 */
	public Set<Account> getAccount() {
		return account;
	}



	/**
	 * @param account the account to set
	 */
	public void setAccount(Set<Account> account) {
		this.account = account;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return super.toString()+" PK_ROLES: " + this.pkRole +" name: " + this.name
				+" descrption: " + this.description;
	}

	

}
