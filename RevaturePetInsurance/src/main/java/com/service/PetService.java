package com.service;

import java.util.LinkedHashMap;
import java.util.List;

import com.model.Pet;

public interface PetService {
	
	public void createPet(Pet myPet);
	
	public List<Pet> getOwnerPets(int ownerAccountNum);
	
	public void updateInfo(Pet myPet);

}
