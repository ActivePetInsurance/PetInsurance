package com.controller;

import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Owner;
import com.service.OwnerService;

@Controller
@RequestMapping(value="/log")
@CrossOrigin(origins="http://localhost:4200", allowCredentials="true")
public class LoginController {
	
	private OwnerService os;
	
	public LoginController() {
		
	}
	
	@Autowired
	public LoginController(OwnerService os) {
		this.os = os;
	}

	
	@PostMapping(value="/login.app", consumes = MediaType.ALL_VALUE)
	public  @ResponseBody Owner login(@RequestBody Object loginCreds, HttpSession session) {
		
		System.out.println("here");
		LinkedHashMap ownerM = (LinkedHashMap) loginCreds;

		String email = (String) ownerM.get("email");
		String password = (String) ownerM.get("password");
//		System.out.println(email);
//		System.out.println(password);
		Owner owner = os.verifyLogin(email, password);
		
		return owner;
	}

	
	public @ResponseBody String[] logout(HttpServletRequest req) {
		HttpSession ses = req.getSession();
		Owner owner = (Owner)ses.getAttribute("loggedUser");
		ses.invalidate();
		String[] s = {"You are logged out"};
		return s;
	}
}
