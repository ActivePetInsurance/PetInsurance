package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Routing {

	@Id
	@Column(name = "payment_id")
	@GeneratedValue(strategy=GenerationType.AUTO)

	private int payment_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="routing_number")
	private int routingNumber;
	
	@Column(name="account_type")
	private String accountType;
	
	@Column(name="account_number")
	private int accountNumber;
	
	@Column(name="paid_amount")
	private double paidAmount;

	public int getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(int routingNumber) {
		this.routingNumber = routingNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public Routing(int payment_id, String name, int routingNumber, String accountType, int accountNumber,
			double paidAmount) {
		this.payment_id = payment_id;
		this.name = name;
		this.routingNumber = routingNumber;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.paidAmount = paidAmount;
	}
	
	

	public Routing(String name, int routingNumber, String accountType, int accountNumber, double paidAmount) {
		super();
		this.name = name;
		this.routingNumber = routingNumber;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.paidAmount = paidAmount;
	}

	public Routing() {
	}

	@Override
	public String toString() {
		return "Routing [payment_id=" + payment_id + ", name=" + name + ", routingNumber=" + routingNumber
				+ ", accountType=" + accountType + ", accountNumber=" + accountNumber + ", paidAmount=" + paidAmount
				+ "]";
	}
	
	
	
	
	
	
	
	
}
