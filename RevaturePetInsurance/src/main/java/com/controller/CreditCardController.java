package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.CreditCardDao;
import com.model.CreditCard;

@Controller
@RequestMapping(value="/api")
public class CreditCardController {
	private CreditCardDao ccd;
	
	public CreditCardController() {
	}
	
	@Autowired
	public CreditCardController(CreditCardDao ccd) {
		this.ccd = ccd;
	}
	@PostMapping(value="/postcreditCardinfo.app")
	public @ResponseBody CreditCard getCreditCardbyID(@RequestParam("id") int num, @RequestParam("address") String address,
				@RequestParam("cardExpiration") String exDate, @RequestParam("cardNum") int cardNum, @RequestParam("city") String city,
				@RequestParam("cvv")int cvv, @RequestParam("state")String state, @RequestParam("zipCode") int zipCode, @RequestParam("ownerId")int ownerId) {
		CreditCard cc1 = new CreditCard(address, city, state, zipCode, cardNum, exDate, cvv);
		ccd.insert(cc1);
		return cc1;
	}
}
