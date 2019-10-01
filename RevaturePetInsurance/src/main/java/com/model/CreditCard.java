package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreditCard {
	
	@Id
	@Column(name = "payment_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="billing_street_address")
	private String billingStreetAddress;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zipcode")
	private int zipcode;
	
	@Column(name="card_number")
	private long cardNumber;
	
	@Column(name="card_expiration_date")
	private String cardExpirationDate;
	
	@Column(name="cvv")
	private int cvv;
	@Column(name = "paid_amount")
	private double paidAmount;
	
	public CreditCard() {
	}
	
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBillingStreetAddress() {
		return billingStreetAddress;
	}
	public void setBillingStreetAddress(String billingStreetAddress) {
		this.billingStreetAddress = billingStreetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardExpirationDate() {
		return cardExpirationDate;
	}
	public void setCardExpirationDate(String cardExpirationDate) {
		this.cardExpirationDate = cardExpirationDate;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public double getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}
	public CreditCard(int paymentId, String name, String billingStreetAddress, String city, String state, int zipcode,
			long cardNumber, String cardExpirationDate, int cvv, double paidAmount) {
		super();
		this.paymentId = paymentId;
		this.name = name;
		this.billingStreetAddress = billingStreetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.cardNumber = cardNumber;
		this.cardExpirationDate = cardExpirationDate;
		this.cvv = cvv;
		this.paidAmount = paidAmount;
	}
	public CreditCard(String name, String billingStreetAddress, String city, String state, int zipcode, long cardNumber,
			String cardExpirationDate, int cvv, double paidAmount) {
		super();
		this.name = name;
		this.billingStreetAddress = billingStreetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.cardNumber = cardNumber;
		this.cardExpirationDate = cardExpirationDate;
		this.cvv = cvv;
		this.paidAmount = paidAmount;
	}
	@Override
	public String toString() {
		return "CreditCard [paymentId=" + paymentId + ", name=" + name + ", billingStreetAddress="
				+ billingStreetAddress + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
				+ ", cardNumber=" + cardNumber + ", cardExpirationDate=" + cardExpirationDate + ", cvv=" + cvv
				+ ", paidAmount=" + paidAmount + "]";
	}
	
	
	

}
