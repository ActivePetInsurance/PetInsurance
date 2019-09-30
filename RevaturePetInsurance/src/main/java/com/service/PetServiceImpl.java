package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OwnerDao;
import com.dao.PetDao;
import com.model.Owner;
import com.model.Pet;

@Service("petServ")
public class PetServiceImpl implements PetService {
	
	private PetDao pd;
	private OwnerDao od;
	private List<Pet> myPetList;
	
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
	public List<Pet> getOwnerPets(int ownerAccountNum) {
		
		Owner own = od.selectOwnerByAccount(ownerAccountNum);
		
		for(Pet pet : pd.selectAll()) {
			if(pet.getOwner().equals(own)) {
				myPetList.add(pet);
			}
		}

		return myPetList;
	}

	@Override
	public void updateInfo(Pet myPet) {
		pd.update(myPet);
	}


}
