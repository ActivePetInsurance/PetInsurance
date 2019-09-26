package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Veterinarian;
import com.util.HibernateUtil;

public class VeterinarianDao {
	
	public void insert (Veterinarian myVeterinarian) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(myVeterinarian);
		tx.commit();
		
	}
	public void update (Veterinarian myVeterinarian) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(myVeterinarian);
		tx.commit();
	}
	
	public List<Veterinarian> selectAll(){
		Session ses = HibernateUtil.getSession();
		List<Veterinarian> petList = ses.createQuery("from Veterinarian", Veterinarian.class).list();
		return petList;
	}
	
	public Veterinarian selectInsurancePlanByID(int insurancePlanId) {
		Session ses = HibernateUtil.getSession();
		Veterinarian ip = ses.get(Veterinarian.class, insurancePlanId);
		return ip;
		
	}


}
