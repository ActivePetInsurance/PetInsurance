package com.service;

import java.util.List;

import com.model.InsurancePlan;
import com.model.Owner;
import com.model.Pet;
import com.model.Policy;

public interface OwnerService {
	
	public Owner verifyLogin(String email, String password);
	
	public Owner loginEmailCheck(String email, List<Owner> owners);
	
	public boolean loginPasswordCheck(String email, String password, Owner owner);
	
	public void updateInfo(Owner o);
	
	public void insertOwner(Owner o);
	
	public void insertNewPolicy(InsurancePlan inPlan, Owner o, List<Pet> petList);
	
	public List<Policy> selectOwnerPolicy(int oId);
	
	public List<Policy> selectAllPolicy();
	
	public Owner selectOwnerById(int oId);
	
	public Policy selectPolicyById(int pId);
	
	public void updatePolicy(Policy newPol);

}
