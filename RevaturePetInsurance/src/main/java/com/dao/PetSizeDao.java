package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.PetSize;
import com.util.HibernateUtil;

public class PetSizeDao {
	
	public void insert (PetSize myPetSize) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(myPetSize);
		tx.commit();
		
	}
	public void update (PetSize myPetSize) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(myPetSize);
		tx.commit();
	}
	
	public List<PetSize> selectAll(){
		Session ses = HibernateUtil.getSession();
		List<PetSize> petList = ses.createQuery("from PetSize", PetSize.class).list();
		return petList;
	}
	
	public PetSize selectInsurancePlanByID(int insurancePlanId) {
		Session ses = HibernateUtil.getSession();
		PetSize ip = ses.get(PetSize.class, insurancePlanId);
		return ip;
		
	}
}
