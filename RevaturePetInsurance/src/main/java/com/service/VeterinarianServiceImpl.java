package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.VeterinarianDao;
import com.model.Veterinarian;

public class VeterinarianServiceImpl implements VeterinarianService {
	
	private VeterinarianDao vd;
	
	public VeterinarianServiceImpl() {
		
	}
	
	@Autowired
	public VeterinarianServiceImpl(VeterinarianDao vd) {
		this.vd = vd;
	}

	@Override
	public List<Veterinarian> allVets() {
		
		return vd.selectAll();
	}

	@Override
	public List<Veterinarian> vetsByZip(int zip) {
		List<Veterinarian> vetsByZip = new ArrayList<Veterinarian>() ;
		List<Veterinarian> allVets = vd.selectAll();
		
		for(Veterinarian vet : allVets) {
			if(vet.getZipCode()==zip) {
				vetsByZip.add(vet);
			}
		}
		return vetsByZip;
	} 

}
