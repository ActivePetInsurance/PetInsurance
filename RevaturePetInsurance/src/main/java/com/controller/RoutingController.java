package com.controller;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.RoutingDao;
import com.model.Routing;

@Controller
@RequestMapping(value="/payment")
@CrossOrigin(origins="*")
public class RoutingController {
	private RoutingDao rd;
	
	public RoutingController(){
	}
	
	@Autowired
	public RoutingController(RoutingDao rd) {
		this.rd = rd;
	}
	
	@PostMapping(value="/makePaymentBA.app", consumes = MediaType.ALL_VALUE)
	public @ResponseBody String[] makePayment(@RequestBody Object newBaRouting) {
		LinkedHashMap BA = (LinkedHashMap) newBaRouting;
		
		System.out.println(BA);
		
		String name = (String)BA.get("nameBA");
		int routingNum = Integer.parseInt((String)BA.get("routingNumBA"));
		String accountTypeBA = (String)BA.get("accountTypeBA");
		int accountNumBA = Integer.parseInt((String)BA.get("accountNumBA"));
		double paidAmount = Double.parseDouble((String)BA.get("paidAmount"));
		
		
		System.out.println(name + " " + routingNum+ " " + accountTypeBA+ " "+ accountNumBA + " "+ paidAmount);
		
		Routing r = new Routing(name, routingNum, accountTypeBA,accountNumBA, paidAmount);
		rd.insert(r);
		
		String[] s = {"success"};
		return s;
	}

}
