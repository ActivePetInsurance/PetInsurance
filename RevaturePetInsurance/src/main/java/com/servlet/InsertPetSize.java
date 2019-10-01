package com.servlet;

import com.dao.PetSizeDao;
import com.model.PetSize;

public class InsertPetSize {
	
	public static PetSizeDao psd = new PetSizeDao();
	
	public static void InsertInitialPetSize(){
	
		PetSize small = new PetSize(1, "small");
		PetSize medium = new PetSize(2, "medium");
		PetSize large = new PetSize(3, "large");
		
		psd.insert(small);
		psd.insert(medium);
		psd.insert(large);
		
		
	}

}
