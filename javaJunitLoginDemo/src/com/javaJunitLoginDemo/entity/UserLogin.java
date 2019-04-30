package com.javaJunitLoginDemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserLogin {

	@Id
	private int id;
	private String email;
	private String name;
	private String password;
	private String address;
	private String state;
	private String zipCode;

	// constructors
	public UserLogin() {
		super();

	}

	public UserLogin(int id, String email, String name, String password, String address, String state, String zipCode) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
		this.address = address;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	
	
	@Override
	// equals method to compare
	public boolean equals(Object obj) {
		if(obj instanceof UserLogin ) {
			UserLogin other = (UserLogin) obj;
			
			//validation
			boolean sameId = this.id == other.getId();
			boolean sameEmail = this.email.equals(other.getEmail());
			boolean sameName = this.name.equals(other.getName());
			boolean samePassword = this.password.equals(other.getPassword());
			boolean sameAddress = this.address.equals(other.getAddress());
			boolean sameState = this.state.equals(other.getState());
			boolean sameZipCode = this.zipCode.equals(other.getZipCode());
			
			if(sameId && sameEmail&& sameName && samePassword && sameAddress&& sameState && sameZipCode) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	// toString for printing
	public String toString() {
		return "UserLogin [id=" + id + ", email=" + email + ", name=" + name + ", password=" + password + ", address="
				+ address + ", state=" + state + ", zipCode=" + zipCode + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	// getter and setter

	
}
