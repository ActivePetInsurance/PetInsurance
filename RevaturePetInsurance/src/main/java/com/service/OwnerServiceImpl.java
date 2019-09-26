package com.service;

import com.dao.OwnerDao;
import com.model.Owner;

public class OwnerServiceImpl implements OwnerService {
	
	private OwnerDao od;
	private Owner owner;

	@Override
	public boolean verifyLogin(String email, String password) {

		owner = od.selectOwnerByEmail(email);
		
		if (owner.getPassword().equals(password)) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public void updateInfo(Owner o) {
		// TODO Auto-generated method stub
		
	}

}
