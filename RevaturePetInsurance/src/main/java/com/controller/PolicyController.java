package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Policy;
import com.service.PolicyServiceImpl;

@Controller
public class PolicyController {
	
	private PolicyServiceImpl psi;
	
	public PolicyController() {
	}
	
	@Autowired
	public PolicyController(PolicyServiceImpl psi) {
		this.psi=psi;
	}
	
	@PostMapping("/getPolicy.app")
	public @ResponseBody Policy displayPolicy(HttpServletRequest req, HttpServletResponse res) {
		HttpSession ses = req.getSession();
		Policy policy = (Policy)ses.getAttribute("myPolicy");
		return policy;
		
	}
	
	
	

}
