package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Owner;
import com.service.OwnerServiceImpl;

@Controller
public class OwnerController {
	
	private OwnerServiceImpl os;
	
	public OwnerController() {
	}
	
	@Autowired
	public OwnerController(OwnerServiceImpl os) {
		this.os = os;
	}
	
	@PostMapping(value="/getOwner.app")
	public @ResponseBody Owner displayOwner(HttpServletRequest req, HttpServletResponse res) {
		HttpSession ses = req.getSession();
		Owner owner = (Owner)ses.getAttribute("loggedUser");
		return owner;
	}

}
