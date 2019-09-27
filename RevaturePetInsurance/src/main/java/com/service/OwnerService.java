package com.service;

import java.util.List;

import com.model.Owner;

public interface OwnerService {
	
	public Owner verifyLogin(String email, String password);
	
	public Owner loginEmailCheck(String email, List<Owner> owners);
	
	public boolean loginPasswordCheck(String email, String password, Owner owner);
	
	public void updateInfo(Owner o);

}
