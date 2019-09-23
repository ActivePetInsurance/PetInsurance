package com.servlet;

import com.dao.PetSizeDao;
import com.model.PetSize;

public class InsertPetSize {
	
	public static PetSizeDao psd = new PetSizeDao();
	
	public static void InsertInitialPetSize(){
	
		PetSize small = new PetSize(1, "small");
		PetSize large = new PetSize(3, "large");
		PetSize medium = new PetSize(2, "medium");
		
		psd.insert(small);
		psd.insert(medium);
		psd.insert(large);
		
		
	}

}
