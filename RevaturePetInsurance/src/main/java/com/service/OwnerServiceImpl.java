package com.service;

import com.dao.OwnerDao;
import com.model.Owner;

public class OwnerServiceImpl implements OwnerService {

	private OwnerDao od;

	@Override
	public boolean verifyLogin(String email, String password) {

//		if (od.getOwner(email).getPassword == password) {
//			return true;
//		} else {
//			return false;
//		}
		
		return false;
	}

	@Override
	public void updateInfo(Owner o) {
		// TODO Auto-generated method stub
		
	}
	
	

}
