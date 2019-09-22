package com.servlet;

import com.dao.PetTypeDao;
import com.model.PetType;

public class InsertPetType {
	
	public static PetTypeDao ptd = new PetTypeDao();
	public static void InsertInitialPetType() {
		
		PetType bird = new PetType(1, "Bird");
		PetType rodent = new PetType(2, "Rodent");
		PetType reptile = new PetType(3, "Reptile");
		
		ptd.insert(bird);
		ptd.insert(rodent);
		ptd.insert(reptile);
	}

}
