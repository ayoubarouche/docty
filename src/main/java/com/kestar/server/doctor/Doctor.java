package com.kestar.server.doctor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Doctor {
	
	@Id
	String address;
	String email;
	String password; 
	String privateKey; 

	public Doctor() {
		super();
	}

	public Doctor(String address) {
		super();
		this.address = address;
	}

	public Doctor(String address, String email, String password, String privateKey) {
		super();
		this.address = address;
		this.email = email;
		this.password = password;
		this.privateKey = privateKey;
	}

	@Override
	public String toString() {
		return "Doctor [address=" + address + ", email=" + email + ", password=" + password + ", privateKey="
				+ privateKey + "]";
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}
	
	

}
