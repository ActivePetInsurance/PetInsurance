package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Veterinarian {
	
	@Id
	@Column(name="vet_id")
	private int vet_id;
	
	@Column(name = "first_name")
	private String firtName;
	
	@Column(name= "middle_initial")
	private String middleInitial;
	
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "license_number")
	private int licenseNumber;
	
	@Column(name = "license_expiration_date")
	private String licenseExpirationDate;
	
	@Column(name = "license_issue_date")
	private String licenseIssueDate;
	
	@Column(name = "license_status")
	private boolean licenseStatus;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "zipcode")
	private int zipCode;

	public Veterinarian(int vet_id, String firtName, String middleInitial, String lastName, int licenseNumber,
			String licenseExpirationDate, String licenseIssueDate, boolean licenseStatus, String city, int zipCode) {
		this.vet_id = vet_id;
		this.firtName = firtName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.licenseNumber = licenseNumber;
		this.licenseExpirationDate = licenseExpirationDate;
		this.licenseIssueDate = licenseIssueDate;
		this.licenseStatus = licenseStatus;
		this.city = city;
		this.zipCode = zipCode;
	}

	public Veterinarian() {
	}

	@Override
	public String toString() {
		return "Veterinarian [vet_id=" + vet_id + ", firtName=" + firtName + ", middleInitial=" + middleInitial
				+ ", lastName=" + lastName + ", licenseNumber=" + licenseNumber + ", licenseExpirationDate="
				+ licenseExpirationDate + ", licenseIssuedDate=" + licenseIssueDate + ", licenseStatus="
				+ licenseStatus + ", city=" + city + ", zipCode=" + zipCode + "]";
	}
	
	
	
	
	
	
	
	

}
