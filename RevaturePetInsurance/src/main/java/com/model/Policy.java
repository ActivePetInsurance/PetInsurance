package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="policy")
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
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "pet_fk")
	private List<Pet> petList = new ArrayList<Pet>();
	
	public Policy() {
		// TODO Auto-generated constructor stub
	}

	public Policy(int policyNumber, Owner owner, InsurancePlan insurancePlan, List<Pet> petList) {
		super();
		this.policyNumber = policyNumber;
		this.owner = owner;
		this.insurancePlan = insurancePlan;
		this.petList = petList;
	}
	
	public Policy(Owner owner, InsurancePlan insurancePlan, List<Pet> petList) {
		super();
		this.owner = owner;
		this.insurancePlan = insurancePlan;
		this.petList = petList;
	}
	
	public Policy(Owner owner, InsurancePlan insurancePlan) {
		super();
		this.owner = owner;
		this.insurancePlan = insurancePlan;
	}

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

	public List<Pet> getPetList() {
		return petList;
	}

	public void setPetList(List<Pet> petList) {
		this.petList = petList;
	}

	@Override
	public String toString() {
		return "Policy [policyNumber=" + policyNumber + ", owner=" + owner + ", insurancePlan=" + insurancePlan
				+ ", petList=" + petList + "]";
	}
	
	
}