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
@CrossOrigin(origins="*", allowCredentials="true")
public class LoginController {
	
	private OwnerService os;
	
	public LoginController() {
		
	}
	
	@Autowired
	public LoginController(OwnerService os) {
		this.os = os;
	}
	
	@GetMapping(value="/getCurrentInfo.app")
	public @ResponseBody Owner getLoggedInUser(HttpSession session) {
		System.out.println("in the getCurrentInfo method");
		
		Owner currentUser= (Owner)session.getAttribute("loggedUser");
		System.out.println(currentUser);
		
		
		System.out.println("\n\n\n");
		
		if( currentUser == null ) {
			return new Owner();
		}else {
			return currentUser;
		}
	}

	
	@PostMapping(value="/login.app", consumes = MediaType.ALL_VALUE)
	public  @ResponseBody Owner login(@RequestBody Object loginCreds, HttpServletRequest req) {
		HttpSession ses =req.getSession();
		System.out.println("here");
//		System.out.println(loginCreds);
		LinkedHashMap ownerM = (LinkedHashMap) loginCreds;
//		System.out.println(ownerM.keySet());
		String email = (String) ownerM.get("email");
		String password = (String) ownerM.get("password");
//		System.out.println(email);
		Owner owner = os.verifyLogin(email, password);
		
		ses.setAttribute("loggedUser", owner);
		Owner currentUser= (Owner)ses.getAttribute("loggedUser");
		System.out.println(currentUser);
		
//		if( owner != null ) {
//			ses.setAttribute("loggedUser", owner);
//		}
//		System.out.println(owner);
		
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
