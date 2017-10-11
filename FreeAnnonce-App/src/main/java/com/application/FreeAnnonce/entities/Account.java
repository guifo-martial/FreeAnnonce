package com.application.FreeAnnonce.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="ACCOUNT")
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1208985563008654165L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PK_ACCOUNT")
	protected int pkAccount ;
	@Column(name = "LOGIN", nullable = false, length = 100)
	protected String login;
	@Column(name = "PASSWORD", nullable = false, length = 100)
	protected String Password;
	@Column(name = "DATE_CREATION", nullable = false, length = 100)
	protected Date CreationDate;
	@Column(name = "DATE_LAST_CONN", nullable = false, length = 100)
	protected Date lastConnexionDate;
	@Column(name = "IS_ACTIVE", nullable = false)
	protected boolean isActiveAccount ;
	
	@OneToOne
	@JoinColumn(name = "USER_ID")
	protected User user;
	@ManyToMany
	@JoinTable(name="USER_ROLE",
	joinColumns=@JoinColumn(name="CODE_USER"),
	inverseJoinColumns=@JoinColumn(name="CODE_ROLE")		
	)
	protected Set<Roles> roles;

	

	public Account() {
		
	}
	
	public Account(Account account) {
		this.login = account.getLogin();
		this.Password = account.getPassword();
		this.CreationDate = account.getCreationDate();
		this.lastConnexionDate = account.getLastConnexionDate();
		this.isActiveAccount = account.getIsActiveAccount();
		this.user = account.getUser();
	}

	public Account( String login, String password, Date creationDate, Date lastConnexionDate,
			boolean isActiveAccount, User user) {
		this.login = login;
		this.Password = password;
		this.CreationDate = creationDate;
		this.lastConnexionDate = lastConnexionDate;
		this.isActiveAccount = isActiveAccount;
		this.user = user;
	}

	/**
	 * @return the pkAccount
	 */
	public int getPkAccount() {
		return pkAccount;
	}

	/**
	 * @param pkAccount the pkAccount to set
	 */
	public void setPkAccount(int pkAccount) {
		this.pkAccount = pkAccount;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
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
	 * @return the lastConnexionDate
	 */
	public Date getLastConnexionDate() {
		return lastConnexionDate;
	}

	/**
	 * @param lastConnexionDate the lastConnexionDate to set
	 */
	public void setLastConnexionDate(Date lastConnexionDate) {
		this.lastConnexionDate = lastConnexionDate;
	}

	/**
	 * @return the isActiveAccount
	 */
	public boolean getIsActiveAccount() {
		return isActiveAccount;
	}

	/**
	 * @param isActiveAccount the isActiveAccount to set
	 */
	public void setActiveAccount(boolean isActiveAccount) {
		this.isActiveAccount = isActiveAccount;
	}
	
	/**
	 * @return the roles
	 */
	public Set<Roles> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return super.toString() + "PK_ACCOUNT :" + this.pkAccount+"LOGIN : "+ this.login +
				"PASSWORD : **** "+ this.Password + " CREATION_DATE :" + this.CreationDate  +
				 "ISACTIVE : " +this.isActiveAccount;
	}
	
	
	
	

}
