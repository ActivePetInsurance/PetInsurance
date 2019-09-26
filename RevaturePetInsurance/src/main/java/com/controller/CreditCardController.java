package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.CreditCardDao;

@Controller
@RequestMapping(value="/api")
public class BillingController {
	private CreditCardDao ccd;
	
	public BillingController() {
	}
	
	@Autowired
	public BillingController(CreditCardDao ccd) {
		this.ccd = ccd;
	}

}
