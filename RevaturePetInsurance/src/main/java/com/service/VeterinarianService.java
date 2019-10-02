package com.service;

import java.util.List;

import com.model.Veterinarian;

public interface VeterinarianService {
	
	public List<Veterinarian> allVets();
	
	public List<Veterinarian> vetsByZip(int zip);

}
