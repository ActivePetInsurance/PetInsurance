package com.service;

import org.springframework.stereotype.Service;

import com.dao.PolicyDao;
import com.model.Pet;
import com.model.Policy;

@Service("policyServ")
public class PolicyServiceImpl implements PolicyService{
	
	private static PolicyDao pd;

	@Override
	public Policy addPet(Pet pet, Policy myPolicy) {
		if(myPolicy.getPet1().equals(null)) {
			myPolicy.setPet1(pet);
		}else if(myPolicy.getPet2().equals(null)){
			myPolicy.setPet2(pet);
		}else if(myPolicy.getPet3().equals(null)) {
			myPolicy.setPet3(pet);
		}else {
			System.out.println("Max amount of pets on policy");
		}
		
		return null;
	}

	@Override
	public void createPolicy(Policy myPolicy) {
		pd.insert(myPolicy);
		
	}

}
