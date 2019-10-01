package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OwnerDao;
import com.dao.PolicyDao;
import com.model.InsurancePlan;
import com.model.Owner;
import com.model.Pet;
import com.model.Policy;

@Service("ownerServ")
public class OwnerServiceImpl implements OwnerService {
	
	private OwnerDao od;
	private PolicyDao pd;
	
	public OwnerServiceImpl() {
		
	}
	
	@Autowired
	public OwnerServiceImpl(OwnerDao od, PolicyDao pd) {
		this.od = od;
		this.pd = pd;
	}
	
	@Override
	public Owner loginEmailCheck(String email, List<Owner> owners) {
		for(Owner owner : owners) {
			if(owner.getEmail().equals(email)) {
				return owner;
			}
		}
		
		return null;
	}
	
	@Override
	public boolean loginPasswordCheck(String email, String password, Owner owner) {
		
		if(owner.getPassword().equals(password)) {
			return true;
		}
		return false;
	}

	@Override
	public Owner verifyLogin(String email, String password) {

		System.out.println(od.selectAll());
		Owner owner = loginEmailCheck(email, od.selectAll());
		
		if(owner == null) {
			return null;
		}else if(loginPasswordCheck(email, password, owner)== true){
			return owner;
		}
		return null;
	}

	@Override
	public void updateInfo(Owner o) {
		od.update(o);
		
	}

	@Override
	public void insertOwner(Owner o) {
		od.insert(o);	
	}

	@Override
	public void insertNewPolicy(InsurancePlan inPlan, Owner o, List<Pet> petList) {
		
		Policy pol = new Policy(o, inPlan, petList);
		pd.insert(pol);
	}

	@Override
	public List<Policy> selectOwnerPolicy(int oId) {
		System.out.println("Before select all");
		return pd.selectByOwner(oId);
	}

	@Override
	public List<Policy> selectAllPolicy() {

		return  pd.selectAll();
	}

	@Override
	public Owner selectOwnerById(int oId) {
		
		return od.selectOwnerByID(oId);
	}
	
	@Override
	public Policy selectPolicyById(int pId) {
		return pd.selectInsurancePlanByID(pId);
	}

	@Override
	public void updatePolicy(Policy newPol) {
		pd.update(newPol);
		
	}

	

}
