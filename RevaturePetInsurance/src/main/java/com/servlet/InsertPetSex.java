package com.servlet;

import com.dao.PetSexDao;
import com.model.PetSex;

public class InsertPetSex {
	
	public static PetSexDao psd = new PetSexDao();
	
	public static void InserInitialPetSex() {
		PetSex male = new PetSex(0, "male");
		PetSex female = new PetSex(1, "female");
		
		psd.insert(male);
		psd.insert(female);
	}

}
