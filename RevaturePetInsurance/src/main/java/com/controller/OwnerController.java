package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.OwnerDao;
import com.model.Owner;

@Controller
@CrossOrigin(origins="*")
public class OwnerController {
	
	OwnerDao od;
	Owner owner;

	public @ResponseBody Owner updateInfo(HttpSession ses) {
		
		return null;
	}
	
}
