package com.controller;

import java.time.LocalDate;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Owner;
import com.service.OwnerServiceImpl;

@Controller
@RequestMapping(value="/own")
@CrossOrigin(origins="*")
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
	
	@PostMapping(value="/addOwner.app", consumes = MediaType.ALL_VALUE)
	public @ResponseBody String[] insertOwner(@RequestBody Object newOwner) {
		System.out.println("here");
		System.out.println(newOwner);
		LinkedHashMap ownerM = (LinkedHashMap) newOwner;
		System.out.println(ownerM);
//		Owner newO = new Owner(ownerM.get("fName"), "", ownerM.get("lName"), ownerM.get("bDate"))
		String[] s = {"sucess"};
		return s;
//		LocalDate.of(arg0, arg1, arg2)
//		
//		String firstName, String middleInitial, String lastName, String dob,
//		String streetAddress, String city, String state, int zipCode, String phoneNumber, String email,
//		String password
	}
}
