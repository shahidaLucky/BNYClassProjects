package com.jpaSampleProject.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JPAEMPLOYEE")

public class Employee {

	@Id
	@Column(name = "EMPLOYEEID")
	private int EMPLOYEEID;

	@Basic
	@Column(name = "FIRST_NAME")
	private String FIRST_NAME;

	@Basic
	@Column(name = "LAST_NAME")
	private String LAST_NAME;

	@Basic
	@Column(name = "PHONE")
	private String PHONE;

	public int getEMPLOYEEID() {
		return EMPLOYEEID;
	}

	public void setEMPLOYEEID(int eMPLOYEEID) {
		this.EMPLOYEEID = eMPLOYEEID;
	}

	public String getFIRST_NAME() {
		return FIRST_NAME;
	}

	public void setFIRST_NAME(String fIRST_NAME) {
		this.FIRST_NAME = fIRST_NAME;
	}

	public String getLAST_NAME() {
		return LAST_NAME;
	}

	public void setLAST_NAME(String lAST_NAME) {
		this.LAST_NAME = lAST_NAME;
	}

	public String getPHONE() {
		return PHONE;
	}

	public void setPHONE(String PHONE) {
		this.PHONE = PHONE;
	}

	public Employee(int EMPLOYEEID, String FIRST_NAME, String LAST_NAME, String PHONE) {
		super();
		this.EMPLOYEEID = EMPLOYEEID;
		this.FIRST_NAME = FIRST_NAME;
		this.LAST_NAME = LAST_NAME;
		this.PHONE = PHONE;
	}
	
	public Employee() {
		super();
	}



}
