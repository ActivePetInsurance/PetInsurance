package com.servlet;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.PetDao;
import com.model.Pet;

public class HibernateServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static PetDao pd = new PetDao();
	
	
	public HibernateServlet() {
		insertInitialValues();
		InsertPetSize.InsertInitialPetSize();
		InsertPetType.InsertInitialPetType();
		InsertPetSex.InserInitialPetSex();
		InsertInsurancePlans.InsertInitialInsurancePlans();
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException{
		System.out.println("in doGet");
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServlet res)
		throws ServletException, IOException{
		System.out.println("in doPost");
		
		
	}
	
	private static void insertInitialValues() {
		Pet momocat = new Pet(2, "momo");
		pd.insert(momocat);
		
	}
	

}
