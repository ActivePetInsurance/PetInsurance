package com.controller;

import javax.servlet.http.HttpServletRequest;

import com.model.Pet;
import com.service.PetService;

public class PetController {
	
	PetService ps;

	public void newPet(HttpServletRequest req) {
		
		Pet p = (Pet) req.getSession().getAttribute("currentPet");
		if(p!=null) {
			ps.createPet(p);
		}
		
	}
	
	
}
