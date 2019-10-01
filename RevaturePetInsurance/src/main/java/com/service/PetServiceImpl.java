package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OwnerDao;
import com.dao.PetDao;
<<<<<<< HEAD
import com.model.Owner;
=======
import com.dao.PetSexDao;
import com.dao.PetSizeDao;
import com.dao.PetTypeDao;
>>>>>>> development
import com.model.Pet;
import com.model.PetSex;
import com.model.PetSize;
import com.model.PetType;

@Service("petServ")
public class PetServiceImpl implements PetService {
	
	private PetDao pd;
<<<<<<< HEAD
	private OwnerDao od;
	private List<Pet> myPetList;
=======
	private PetSizeDao psd;
	private PetSexDao psxd;
	private PetTypeDao ptd;
>>>>>>> development
	
	public PetServiceImpl() {
		
	}
	
	@Autowired
	public PetServiceImpl(PetDao pd, PetSizeDao psd, PetSexDao psxd, PetTypeDao ptd) {
		this.pd = pd;
		this.psd = psd;
		this.psxd = psxd;
		this.ptd = ptd;
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
<<<<<<< HEAD
	public void updateInfo(Pet myPet) {
		pd.update(myPet);
	}

=======
	public List<Pet> selectAllPets() {
		return pd.selectAll();
		
	}

	@Override
	public PetSize getPetSize(int szId) {
		return psd.selectInsurancePlanByID(szId);
	}

	@Override
	public PetSex getPetSex(int sxId) {
		return psxd.selectInsurancePlanByID(sxId);
	}

	@Override
	public PetType getPetType(int tId) {
		return ptd.selectInsurancePlanByID(tId);
	}

	@Override
	public List<Pet> selectPetByOwnerId(int oId) {
		return pd.selectByOwnerId(oId);
	}
	
	
	
	
>>>>>>> development

}
