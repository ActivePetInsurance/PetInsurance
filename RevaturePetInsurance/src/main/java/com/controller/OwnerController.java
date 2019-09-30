package com.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Owner;
import com.model.Pet;
import com.service.InsurancePlanServiceImpl;
import com.service.OwnerServiceImpl;
import com.service.PetServiceImpl;

@Controller
@RequestMapping(value="/own")
@CrossOrigin(origins="*")
public class OwnerController {
	
	private OwnerServiceImpl os;
	private PetServiceImpl ps;
	private InsurancePlanServiceImpl ips;
	
	public OwnerController() {
	}
	
	@Autowired
	public OwnerController(OwnerServiceImpl os, PetServiceImpl ps, InsurancePlanServiceImpl ips) {
		this.os = os;
		this.ps = ps;
		this.ips = ips;
	}
	
	@PostMapping(value="/getOwner.app")
	public @ResponseBody Owner displayOwner(HttpServletRequest req, HttpServletResponse res) {
		HttpSession ses = req.getSession();
		Owner owner = (Owner)ses.getAttribute("loggedUser");
		return owner;
	}
	
	@PostMapping(value="/addOwner.app", consumes = MediaType.ALL_VALUE)
	public @ResponseBody String[] insertOwner(@RequestBody Object newOwner) {
		System.out.println(newOwner);
		LinkedHashMap ownerM = (LinkedHashMap) newOwner;
		
		String email = (String)ownerM.get("email");

		String add = (String)ownerM.get("add1");
		int zipT = Integer.parseInt((String)ownerM.get("zip"));
		Owner newO = new Owner((String)ownerM.get("fName"), "", (String)ownerM.get("lName"), (String)ownerM.get("bDate"), add, (String)ownerM.get("city"),
				"VA", zipT, (String)ownerM.get("phoneNum"), email.toLowerCase(), (String)ownerM.get("password"));
		os.insertOwner(newO);
		String[] s = {"sucess"};
		return s;
	}
	
	@PostMapping(value="/updateOwner.app", consumes = MediaType.ALL_VALUE)
	public @ResponseBody Owner updateOwner(@RequestBody Object newOwner) {
		List ownerA = (ArrayList) newOwner;
		LinkedHashMap upOwnerM = (LinkedHashMap) ownerA.get(0);
		System.out.println(upOwnerM);
	
		String add = (String)upOwnerM.get("add1");
		int zipT;
		if(upOwnerM.get("zip") instanceof String) {
			zipT = Integer.parseInt((String) upOwnerM.get("zip"));
		} else {
			zipT = (int) upOwnerM.get("zip");
		}
		int accNum = (int) upOwnerM.get("accNum");
		Owner newO = new Owner(accNum, (String)upOwnerM.get("fName"), "", (String)upOwnerM.get("lName"), (String)upOwnerM.get("bDate"), add, (String)upOwnerM.get("city"),
				"VA", zipT, (String)upOwnerM.get("phoneNum"), (String)upOwnerM.get("email"), (String)upOwnerM.get("password"));
		System.out.println(newO);
				os.updateInfo(newO);
		String[] s = {"sucess"};
		return newO;
	}
	
	@PostMapping(value="/getPets.app", consumes = MediaType.ALL_VALUE)
	public @ResponseBody List<Pet> selectOwnerPets(@RequestBody Object newOwner) {
		System.out.println("here in get pets");
		System.out.println(newOwner);
//		List<Pet>
		LinkedHashMap ownerM = (LinkedHashMap) newOwner;
		int accNum = (int) ownerM.get("accountNumber");
		System.out.println("this is in get pets"+ps.selectPetByOwnerId(accNum));
		
		return ps.selectPetByOwnerId(accNum);
	}
	
	@PostMapping(value="/addPolicy.app", consumes = MediaType.ALL_VALUE)
	public @ResponseBody String[] insertOwnerPolicy(@RequestBody Object newOwner) {
		System.out.println("here in add Policy");
//		System.out.println(newOwner);
		List ownerA = (ArrayList) newOwner;
		LinkedHashMap ownerM = (LinkedHashMap) ownerA.get(0);
		System.out.println(ownerM);
		int planId;
		String polPetType = (String)ownerM.get("polPetType");
		String polPlanType = (String)ownerM.get("polPlanType");
		
		if(polPetType.equals("1") && polPlanType.equals("1")) {
			planId = 1;
		} else if(polPetType.equals("1") && polPlanType.equals("2")){
			planId = 2;
		} else if(polPetType.equals("1") && polPlanType.equals("3")){
			planId = 3;
		} else if(polPetType.equals("2") && polPlanType.equals("1")){
			planId = 4;
		} else if(polPetType.equals("2") && polPlanType.equals("2")){
			planId = 5;
		} else if(polPetType.equals("2") && polPlanType.equals("3")){
			planId = 6;
		} else if(polPetType.equals("3") && polPlanType.equals("1")){
			planId = 7;
		} else if(polPetType.equals("3") && polPlanType.equals("2")){
			planId = 8;
		} else {
			planId = 9;
		}
		
		String add = (String)ownerM.get("add1");
		int zipT;
		if(ownerM.get("zip") instanceof String) {
			zipT = Integer.parseInt((String) ownerM.get("zip"));
		} else {
			zipT = (int) ownerM.get("zip");
		}
		int accNum = (int) ownerM.get("accNum");
		Owner newO = new Owner(accNum, (String)ownerM.get("fName"), "", (String)ownerM.get("lName"), (String)ownerM.get("bDate"), add, (String)ownerM.get("city"),
				"VA", zipT, (String)ownerM.get("phoneNum"), (String)ownerM.get("email"), (String)ownerM.get("password"));
		double petWeight = Double.parseDouble((String)ownerM.get("newWeight"));
		double petHeight = Double.parseDouble((String)ownerM.get("newHeight"));
		int petAge = Integer.parseInt((String)ownerM.get("newAge"));
		int petSize = Integer.parseInt((String)ownerM.get("newPetSize"));
		int petSex = Integer.parseInt((String)ownerM.get("newPetSex"));
		int petType = Integer.parseInt(polPetType);
		Pet newPet = new Pet((String)ownerM.get("newPetName"), (String)ownerM.get("newbDate"), petWeight, petHeight, petAge, newO, ps.getPetSize(petSize), ps.getPetSex(petSex), ps.getPetType(petType));
		ps.createPet(newPet);
		List<Pet> petList = new ArrayList<>();
		petList.add(newPet);
		System.out.println(newPet);
		
//		this.name = name;
//		this.dob = dob;
//		this.weight = weight;
//		this.height = height;
//		this.age = age;
//		this.owner = owner;
//		this.size = size;
//		this.sex = sex;
//		this.type = type;
		
		System.out.println(ips.selectPlanById(planId));
		
		os.insertNewPolicy(ips.selectPlanById(planId), newO, petList);
		
		
		String[] s = {"sucess"};
		return s;
	}
	
	@PostMapping(value="/getPolicy.app", consumes = MediaType.ALL_VALUE)
	public @ResponseBody String[] selectOwnerPolicy(@RequestBody Object newOwner) {
		System.out.println("here in get Policy");
//		List<Policy>
//		System.out.println(newOwner);
		LinkedHashMap ownerM = (LinkedHashMap) newOwner;
		System.out.println(ownerM);
		
		System.out.println(os.selectAllPolicy());
//		System.out.println(os.selectOwnerPolicy((Integer)ownerM.get("accountNumber")));
		
		
		String[] s = {"sucess"};
		return s;
	}
}
