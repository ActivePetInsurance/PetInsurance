package com.service;

import com.model.Pet;
import com.model.Policy;

public interface PolicyService {
	
	public Policy addPet(Pet pet, Policy myPolicy);
	
	public void createPolicy(Policy myPolicy);
	

}
