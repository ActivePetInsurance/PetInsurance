package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class InsurancePlan {
	
	
	@Id
	@Column(name = "plan_id")
	private int planId;
	
	@Column(name = "plan_name")
	private String planName;
	
	@Column(name = "deductible")
	private double deductible;
	
	@Column(name = "copay")
	private double copay;
	
	@Column(name = "reimbursement")
	private double reimbursement;
	
	@Column(name="monthly_Fee")
	private double monthlyFee;

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public double getDeductible() {
		return deductible;
	}

	public void setDeductible(double deductible) {
		this.deductible = deductible;
	}

	public double getCopay() {
		return copay;
	}

	public void setCopay(double copay) {
		this.copay = copay;
	}

	public double getReimbursement() {
		return reimbursement;
	}

	public void setReimbursement(double reimbursement) {
		this.reimbursement = reimbursement;
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}

	public InsurancePlan(int planId, String planName, double deductible, double copay, double reimbursement,
			double monthlyFee) {
		this.planId = planId;
		this.planName = planName;
		this.deductible = deductible;
		this.copay = copay;
		this.reimbursement = reimbursement;
		this.monthlyFee = monthlyFee;
	}

	public InsurancePlan() {
	}
	
	

	public InsurancePlan(int planId, String planName) {
		super();
		this.planId = planId;
		this.planName = planName;
	}

	@Override
	public String toString() {
		return "InsurancePlan [planId=" + planId + ", planName=" + planName + ", deductible=" + deductible + ", copay="
				+ copay + ", reimbursement=" + reimbursement + ", monthlyFee=" + monthlyFee + "]";
	}
	
	
	
	

}
