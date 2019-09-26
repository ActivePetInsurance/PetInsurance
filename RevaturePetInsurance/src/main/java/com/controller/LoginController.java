package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.OwnerDao;
import com.model.Owner;
import com.service.OwnerService;

@Controller
@RequestMapping(value="/loog")
@CrossOrigin(origins="*")
public class LoginController {
	
	private OwnerDao od;
	private OwnerService os;
	
	@PostMapping(value="/login.app")
	public @ResponseBody Owner login(HttpServletRequest req, HttpServletResponse res) {
		
		HttpSession ses = req.getSession();
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		if(!(os.verifyLogin(email, password))) {
			return null;
		} else {
			return od.selectOwnerByEmail(email);
		}
	
	}
}
