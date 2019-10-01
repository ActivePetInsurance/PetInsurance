package com.service;

import java.util.List;

import com.model.Pet;
import com.model.PetSex;
import com.model.PetSize;
import com.model.PetType;

public interface PetService {

	public void createPet(Pet myPet);

	public void updateInfo(Pet myPet);

	public List<Pet> selectAllPets();

	public List<Pet> selectPetByOwnerId(int oId);

	public PetSize getPetSize(int szId);

	public PetSex getPetSex(int sxId);

	public PetType getPetType(int tId);

}
