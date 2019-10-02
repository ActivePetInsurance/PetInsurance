package com.controller;

import java.util.LinkedHashMap;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Owner;
import com.model.Pet;
import com.model.PetSex;
import com.model.PetSize;
import com.model.PetType;
import com.model.Policy;
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

//	@PostMapping(value="/getpets.app", consumes = MediaType.ALL_VALUE)
//	public @ResponseBody List<Pet> getOwnPets(@RequestBody Object owner) {
//		LinkedHashMap ownerP = (LinkedHashMap) owner;
//
//		int ownerAccountNum = (Integer) ownerP.get("accountNum");
//
//		return ps.getOwnerPets(ownerAccountNum);
//	}

	@PostMapping(value="/update.app", consumes = MediaType.ALL_VALUE)
	public @ResponseBody Pet updatePetInfo(@RequestBody Object currentPet) {
		System.out.println(currentPet);
		LinkedHashMap petM = (LinkedHashMap) currentPet;
		
		int petId = (int) petM.get("petId");
		String petName = (String) petM.get("petName");
		String dob = (String) petM.get("dob");
		double weight = (double) petM.get("weight");
		double height = (double) petM.get("height");
		int age = (int) petM.get("age");
		Owner owner = (Owner) petM.get("owner");
		PetSize pSize = (PetSize) petM.get("size");
		PetSex pSex = (PetSex) petM.get("sex");
		PetType pType = (PetType) petM.get("type");
		Policy policy =(Policy) petM.get("policy");
		
		Pet updatedPet = new Pet(petId, petName, dob, weight,
								height, age, owner, pSize, pSex, 
								pType, policy);
		
		ps.updateInfo(updatedPet);

		return updatedPet;
	}


}
