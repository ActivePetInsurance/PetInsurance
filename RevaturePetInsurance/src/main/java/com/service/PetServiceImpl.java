package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PetDao;
import com.model.Pet;

@Service("petServ")
public class PetServiceImpl implements PetService {
	
	private PetDao pd;
	
	public PetServiceImpl() {
		
	}
	
	@Autowired
	public PetServiceImpl(PetDao pd) {
		this.pd = pd;
	}
	
	@Override
	public void createPet(Pet myPet) {
		pd.insert(myPet);
		
	}

	@Override
	public void updateInfo() {
		
		
	}

}
