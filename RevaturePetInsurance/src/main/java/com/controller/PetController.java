package com.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Pet;
import com.service.PetServiceImpl;

@Controller
@RequestMapping(value="/pet")
@CrossOrigin(origins="*")
public class PetController {
	
	private PetServiceImpl ps;
	
	public PetController() {

	}
	
	public PetController(PetServiceImpl ps) {
		this.ps = ps;
	}
	
	@PostMapping(value="/getpets.app", consumes = MediaType.ALL_VALUE)
	public @ResponseBody List<Pet> getOwnPets(@RequestBody Object owner) {
		LinkedHashMap ownerP = (LinkedHashMap) owner;
		
		int ownerAccountNum = (Integer) ownerP.get("accountNum");
		
		return ps.getOwnerPets(ownerAccountNum);
	}
	
	@PostMapping(value="/update.app", consumes = MediaType.ALL_VALUE)
	public @ResponseBody Pet updatePetInfo(@RequestBody Object currentPet) {
		System.out.println(currentPet);
		
		
		
		return null;
	}


}
