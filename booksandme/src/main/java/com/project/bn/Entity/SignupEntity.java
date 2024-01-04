package com.project.bn.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="signupdetails")
public class SignupEntity {
	@Column(name="FirstName")
	private String FirstName;
	@Column(name="LastName")
	private String LastName;
	@Id
	@Column(name="email")
	private String email;
	@Column(name="phoneNumber")
	private int phoneNumber;
	@Column(name="spassword")
	private String spassword;
	@Column(name="sconfirmpassword")
	private String sconfirmpassword;
	@Override
	public String toString() {
		return "SignupEntity [FirstName=" + FirstName + ", LastName=" + LastName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", spassword=" + spassword + ", sconfirmpassword=" + sconfirmpassword + "]";
	}
	public SignupEntity(String firstName, String lastName, String email, int phoneNumber, String spassword,
			String sconfirmpassword) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.spassword = spassword;
		this.sconfirmpassword = sconfirmpassword;
	}
	public SignupEntity() {
		super();
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getSpassword() {
		return spassword;
	}
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}
	public String getSconfirmpassword() {
		return sconfirmpassword;
	}
	public void setSconfirmpassword(String sconfirmpassword) {
		this.sconfirmpassword = sconfirmpassword;
	}
	
}
