package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

import com.service.OwnerService;

@Controller
@CrossOrigin(origins="*")
public class LoginController {

	private OwnerService os;
	
	@PostMapping(value="/login.app")
	public String login(HttpServletRequest req) {
		
		HttpSession ses = req.getSession();
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		if(!(os.verifyLogin(email, password))) {
			return "wrongcreds.pets";
			} else {
			ses.setAttribute("loggedUser", email);
			ses.setAttribute("loggedPass", password);
			return "home.pets";
			
	}
	
	}

}
