package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.PetType;
import com.util.HibernateUtil;

public class PetTypeDao {
	
	public void insert (PetType myPetType) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(myPetType);
		tx.commit();
		
	}
	public void update (PetType myPetType) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(myPetType);
		tx.commit();
	}
	
	public List<PetType> selectAll(){
		Session ses = HibernateUtil.getSession();
		List<PetType> petList = ses.createQuery("from PetType", PetType.class).list();
		return petList;
	}
	
	public PetType selectInsurancePlanByID(int insurancePlanId) {
		Session ses = HibernateUtil.getSession();
		PetType ip = ses.get(PetType.class, insurancePlanId);
		return ip;
		
	}

}
