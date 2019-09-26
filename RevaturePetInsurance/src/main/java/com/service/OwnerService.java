package com.service;

import com.model.Owner;

public interface OwnerService {
	
	public boolean verifyLogin(String email, String password);
	
	public void updateInfo(Owner o);

}
