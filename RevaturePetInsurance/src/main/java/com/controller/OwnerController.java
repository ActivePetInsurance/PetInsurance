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
import com.service.OwnerServiceImpl;

@Controller
@RequestMapping(value="/own")
@CrossOrigin(origins="*")
public class OwnerController {
	
	private OwnerServiceImpl os;
	
	public OwnerController() {
	}
	
	@Autowired
	public OwnerController(OwnerServiceImpl os) {
		this.os = os;
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

		String add = (String)ownerM.get("add1");
		int zipT = Integer.parseInt((String)ownerM.get("zip"));
		Owner newO = new Owner((String)ownerM.get("fName"), "", (String)ownerM.get("lName"), (String)ownerM.get("bDate"), add, (String)ownerM.get("city"),
				"VA", zipT, (String)ownerM.get("phoneNum"), (String)ownerM.get("email"), (String)ownerM.get("password"));
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
}
