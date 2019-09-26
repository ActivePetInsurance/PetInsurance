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
	public @ResponseBody CreditCard getCreditCardbyID(@RequestParam("id") int num) {
		return ccd.selectCreditCardByID(num);
	}
}
