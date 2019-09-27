package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CreditCard {
	
	@Id
	@Column(name = "payment_id")
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int paymentId;
	
	@OneToOne(cascade=CascadeType.ALL, fetch =FetchType.EAGER)
	@JoinColumn(name = "owner_fk")
	private Owner owner;
	
	@Column(name="billing_street_address")
	private String billingStreetAddress;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zipcode")
	private int zipcode;
	
	@Column(name="card_number")
	private int cardNumber;
	
	@Column(name="card_expiration_date")
	private String cardExpirationDate;
	
	@Column(name="cvv")
	private int cvv;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
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

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
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

	public CreditCard(int paymentId, Owner owner, String billingStreetAddress, String city, String state, int zipcode,
			int cardNumber, String cardExpirationDate, int cvv) {
		super();
		this.paymentId = paymentId;
		this.owner = owner;
		this.billingStreetAddress = billingStreetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.cardNumber = cardNumber;
		this.cardExpirationDate = cardExpirationDate;
		this.cvv = cvv;
	}

	public CreditCard() {
	}

	@Override
	public String toString() {
		return "CreditCard [paymentId=" + paymentId + ", owner=" + owner + ", billingStreetAddress="
				+ billingStreetAddress + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
				+ ", cardNumber=" + cardNumber + ", cardExpirationDate=" + cardExpirationDate + ", cvv=" + cvv + "]";
	}
	
	
	


}
