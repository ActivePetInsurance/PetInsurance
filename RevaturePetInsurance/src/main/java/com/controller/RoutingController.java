package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.RoutingDao;
import com.model.Routing;

@Controller
@RequestMapping(value="/api")
public class RoutingController {
	private RoutingDao rd;
	
	public RoutingController(){
	}
	
	@Autowired
	public RoutingController(RoutingDao rd) {
		this.rd = rd;
	}
	
	@PostMapping(value="/routinginfo")
	public @ResponseBody Routing getRoutingInfo(@RequestParam("paymendId") int paymentId,
			@RequestParam("accountNum")int accountNum, @RequestParam("accountType")String accountType,
			@RequestParam("name")String name, @RequestParam("paidAmount") double paidAmount) {
		return null;
	}

}
