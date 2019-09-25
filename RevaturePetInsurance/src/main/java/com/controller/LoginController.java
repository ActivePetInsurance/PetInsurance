package com.controller;

import javax.servlet.http.HttpServletRequest;

import com.service.OwnerService;

public class LoginController {
	
	public String login(HttpServletRequest req) {
		
		OwnerService os;
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		// 
		
//		if(!(os.verifyLogin(email, password))) {
//			return "wrongcreds.pets";
//		} else {
//			req.getSession().setAttribute("loggedUser", email);
//			req.getSession().setAttribute("loggedPass", password);
//			return "home.pets";
//		}
		
		return "";
	}

}
