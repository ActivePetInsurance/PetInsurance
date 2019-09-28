package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OwnerDao;
import com.model.Owner;

@Service("ownerServ")
public class OwnerServiceImpl implements OwnerService {
	
	private OwnerDao od;
	
	public OwnerServiceImpl() {
		
	}
	
	@Autowired
	public OwnerServiceImpl(OwnerDao od) {
		this.od = od;
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
	
	

}
