package com.controller;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.CreditCardDao;
import com.model.CreditCard;

@Controller
@RequestMapping(value="/payment")
@CrossOrigin(origins="*")
public class CreditCardController {
	private CreditCardDao ccd;
	
	public CreditCardController() {
	}
	
	@Autowired
	public CreditCardController(CreditCardDao ccd) {
		this.ccd = ccd;
	}
	@PostMapping(value="/makePaymentCC.app")
	public @ResponseBody String[] makePaymentCC(@RequestBody Object newCCpayment) {
		LinkedHashMap CC = (LinkedHashMap) newCCpayment;
		
		System.out.println(CC);
		
		String name=(String)CC.get("nameCC");
		String billAdd= (String)CC.get("billAddCC");
		String city = (String)CC.get("cityCC");
		String state = (String)CC.get("stateCC");
		int zipcode = Integer.parseInt((String)CC.get("zipcodeCC"));
		long cardnum = Long.parseLong((String)CC.get("cardnumCC"));
		String cardExpir = (String)CC.get("cardexpirCC");
		int cvv = Integer.parseInt((String)CC.get("cvv"));
		double paidAmount = Double.parseDouble((String)CC.get("paidAmount"));
		
		CreditCard c = new CreditCard(name, billAdd, city, state, zipcode, cardnum, cardExpir, cvv, paidAmount);
		ccd.insert(c);
		
		
	
		String[] s = {"success"};
		return s;
	}
}
