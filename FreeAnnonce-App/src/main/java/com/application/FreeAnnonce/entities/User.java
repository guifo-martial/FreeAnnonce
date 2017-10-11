package com.application.FreeAnnonce.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="USERS")
public class User implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 3536965685916320661L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PK_USERS")
	protected int pkUser;
	@Column(name = "LASTNAME", nullable = false, length = 100)
	protected String lastName;
	@Column(name = "FIRSTNAME", nullable = false, length = 100)
	protected String firsName;
	@Column(name = "EMAIL", nullable = false, length = 100)
	protected String email;
	@Column(name = "PHONE_NUMBER", nullable = true, length = 100)
	protected String phoneNumber;
	@Column(name = "CNI_NUMBER", nullable = false, length = 100)
	protected String cniNumber;
	
	@OneToOne(mappedBy="user")
	@JoinColumn(name="ACCOUNT_ID")
	protected Account account;
	@OneToMany(mappedBy="user",fetch=FetchType.LAZY)
	protected Set<Add> adds;
	
	public User() {
		
	}

	public User(String lastName, String firsName, String email, String phoneNumber, String cniNumber) {
		this.lastName = lastName;
		this.firsName = firsName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.cniNumber = cniNumber;
	}
	
	public User(User user){
		this.lastName = user.getLastName();
		this.firsName = user.getFirsName();
		this.email = user.getEmail();
		this.phoneNumber = user.getPhoneNumber();
		this.cniNumber = user.getCniNumber();
	}

	/**
	 * @return the pkUser
	 */
	public int getPkUser() {
		return pkUser;
	}

	/**
	 * @param pkUser the pkUser to set
	 */
	public void setPkUser(int pkUser) {
		this.pkUser = pkUser;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firsName
	 */
	public String getFirsName() {
		return firsName;
	}

	/**
	 * @param firsName the firsName to set
	 */
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the cniNumber
	 */
	public String getCniNumber() {
		return cniNumber;
	}

	/**
	 * @param cniNumber the cniNumber to set
	 */
	public void setCniNumber(String cniNumber) {
		this.cniNumber = cniNumber;
	}

	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " pk_user : "+ this.pkUser +" lastname : "+ this.lastName 
				+" firstname : "+ this.firsName + " email : "+ this.email 
				+ " phone_number : "+ this.phoneNumber + " cni_number : "+ this.cniNumber;
	}
	
	

}
