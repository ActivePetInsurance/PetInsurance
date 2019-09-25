package com.service;

import com.dao.PetDao;
import com.model.Pet;

public class PetServiceImpl implements PetService {

	PetDao pd;
	
	@Override
	public void createPet(Pet myPet) {
		pd.insert(myPet);
		
	}

	@Override
	public void updateInfo() {
		
		
	}

}
