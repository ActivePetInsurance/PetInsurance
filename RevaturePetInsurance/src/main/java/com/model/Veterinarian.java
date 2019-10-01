package com.model;


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


	public int getVet_id() {
		return vet_id;
	}

	public void setVet_id(int vet_id) {
		this.vet_id = vet_id;
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getLicenseExpirationDate() {
		return licenseExpirationDate;
	}

	public void setLicenseExpirationDate(String licenseExpirationDate) {
		this.licenseExpirationDate = licenseExpirationDate;
	}

	public String getLicenseIssueDate() {
		return licenseIssueDate;
	}

	public void setLicenseIssueDate(String licenseIssueDate) {
		this.licenseIssueDate = licenseIssueDate;
	}

	public boolean isLicenseStatus() {
		return licenseStatus;
	}

	public void setLicenseStatus(boolean licenseStatus) {
		this.licenseStatus = licenseStatus;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public Veterinarian(int vet_id, String firtName, String middleInitial, String lastName, int licenseNumber,
			String licenseExpirationDate, String licenseIssuedDate, boolean licenseStatus, String city, int zipCode) {
		this.vet_id = vet_id;
		this.firtName = firtName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.licenseNumber = licenseNumber;
		this.licenseExpirationDate = licenseExpirationDate;
		this.licenseIssueDate = licenseIssuedDate;
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
