package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.PetSex;
import com.util.HibernateUtil;

public class PetSexDao {
	public void insert (PetSex myPetSex) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(myPetSex);
		tx.commit();
		
	}
	public void update (PetSex myPetSex) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(myPetSex);
		tx.commit();
	}
	
	public List<PetSex> selectAll(){
		Session ses = HibernateUtil.getSession();
		List<PetSex> petList = ses.createQuery("from PetSex", PetSex.class).list();
		return petList;
	}
	
	public PetSex selectInsurancePlanByID(int insurancePlanId) {
		Session ses = HibernateUtil.getSession();
		PetSex ip = ses.get(PetSex.class, insurancePlanId);
		return ip;
		
	}

}
