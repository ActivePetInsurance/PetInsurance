package com.controller;

import java.time.LocalDate;
import java.util.LinkedHashMap;

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
		String temp = (String) ownerM.get("bDate");
		String dem = "[-]";
		String[] demLine = temp.split(dem);
		System.out.println(demLine[0]);
//		LocalDate.of(Integer.parseInt(demLine[0]), Integer.parseInt(demLine[1]), Integer.parseInt(demLine[3]));
		String add = (String)ownerM.get("add1") + " " + (String)ownerM.get("add2");
		int zipT = Integer.parseInt((String)ownerM.get("zip"));
		Owner newO = new Owner((String)ownerM.get("fName"), "", (String)ownerM.get("lName"), "", add, (String)ownerM.get("city"),
				"VA", zipT, (String)ownerM.get("phoneNum"), (String)ownerM.get("email"), (String)ownerM.get("password"));
		os.insertOwner(newO);
		String[] s = {"sucess"};
		return s;
	}
}
