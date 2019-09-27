package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Owner;
import com.service.OwnerService;

@Controller
@CrossOrigin(origins="*")
public class LoginControllerTest {

		private OwnerService os;
		
		public LoginControllerTest() {
			
		}
		
		@Autowired
		public LoginControllerTest(OwnerService os) {
			this.os = os;
		}
		
		@PostMapping(value="/login.app")
		public  @ResponseBody String login(HttpServletRequest req, HttpServletResponse res) {
			
			HttpSession ses = req.getSession();
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			Owner owner = os.verifyLogin(email, password);
			
			if(owner.equals(null)) {
				return "false";
				} else {
				ses.setAttribute("loggedUser", owner);
				return "true";		
		}
		
		}
		
		public void logout(HttpServletRequest req) {
			HttpSession ses = req.getSession();
			Owner owner = (Owner)ses.getAttribute("loggedUser");
			ses.invalidate();
		}
	}
