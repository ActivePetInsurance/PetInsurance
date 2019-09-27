package com.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;
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
import com.service.OwnerService;

@Controller
@RequestMapping(value="/log")
@CrossOrigin(origins="*")
public class LoginController {
	
	private OwnerService os;
	
	public LoginController() {
		
	}
	
	@Autowired
	public LoginController(OwnerService os) {
		this.os = os;
	}
	
	@PostMapping(value="/login.app", consumes = MediaType.ALL_VALUE)
	public  @ResponseBody Owner login(@RequestBody Object whyTrevin) {
		System.out.println("here");
		System.out.println(whyTrevin);
		LinkedHashMap ownerM = (LinkedHashMap) whyTrevin;
		System.out.println(ownerM.keySet());
		String email = (String) ownerM.get("email");
		String password = (String) ownerM.get("password");
		System.out.println(email);
		Owner owner = os.verifyLogin(email, password);
		System.out.println(owner);
		
//		if(owner.equals(null)) {
//			System.out.println("In false");
//			return "false";
//			} else {
//				System.out.println("In true");
//			return "true";
//			}
		
		return owner;
	}

	
	public void logout(HttpServletRequest req) {
		HttpSession ses = req.getSession();
		Owner owner = (Owner)ses.getAttribute("loggedUser");
		ses.invalidate();
	}
}
