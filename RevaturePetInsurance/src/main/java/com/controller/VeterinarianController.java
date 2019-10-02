package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Veterinarian;
import com.service.VeterinarianService;

@Controller
@RequestMapping(value="/vet")
@CrossOrigin(origins="*", allowCredentials="true")
public class VeterinarianController {
	
	private VeterinarianService vs;
	
	public VeterinarianController() {
		
	}

	@Autowired
	public VeterinarianController(VeterinarianService vs) {
		this.vs = vs;
	}
	
	@GetMapping(value="/allVets.app")
	public @ResponseBody List<Veterinarian> getAllVets() {
		return vs.allVets();
	}
	
	@PostMapping(value="/getVetsZip.app")
	public @ResponseBody List<Veterinarian> getVetByZip(@RequestBody int zip) {
		
		return vs.vetsByZip(zip);
	}
	
	
}
