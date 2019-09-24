package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CreditCard {
	
	@Id
	@Column(name = "payment_id")
	private int paymentId;


}
