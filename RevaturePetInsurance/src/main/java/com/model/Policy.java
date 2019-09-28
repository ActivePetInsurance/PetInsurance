package com.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Policy {

	@Id
	@Column(name = "policy_number")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int policyNumber;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "owner_fk")
	private Owner owner;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "insurance_plan_fk")
	private InsurancePlan insurancePlan;

	@OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "pet1_fk")
	private Pet pet1;
	
	@OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "pet2_fk")
	private Pet pet2;
	
	@OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "pet3_fk")
	private Pet pet3;

	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public InsurancePlan getInsurancePlan() {
		return insurancePlan;
	}

	public void setInsurancePlan(InsurancePlan insurancePlan) {
		this.insurancePlan = insurancePlan;
	}

	public Pet getPet1() {
		return pet1;
	}

	public void setPet1(Pet pet1) {
		this.pet1 = pet1;
	}

	public Pet getPet2() {
		return pet2;
	}

	public void setPet2(Pet pet2) {
		this.pet2 = pet2;
	}

	public Pet getPet3() {
		return pet3;
	}

	public void setPet3(Pet pet3) {
		this.pet3 = pet3;
	}

	public Policy(int policyNumber, Owner owner, InsurancePlan insurancePlan, Pet pet1, Pet pet2, Pet pet3) {
		super();
		this.policyNumber = policyNumber;
		this.owner = owner;
		this.insurancePlan = insurancePlan;
		this.pet1 = pet1;
		this.pet2 = pet2;
		this.pet3 = pet3;
	}

	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Policy [policyNumber=" + policyNumber + ", owner=" + owner + ", insurancePlan=" + insurancePlan
				+ ", pet1=" + pet1 + ", pet2=" + pet2 + ", pet3=" + pet3 + "]";
	}
	
	
	
	
}
