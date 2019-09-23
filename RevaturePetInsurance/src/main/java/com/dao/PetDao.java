package com.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Pet;
import com.util.HibernateUtil;

public class PetDao {
	
	public void insert (Pet myPet) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(myPet);
		tx.commit();
		
	}
	public void update (Pet myPet) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(myPet);
		tx.commit();
	}
	
	public List<Pet> selectAll(){
		Session ses = HibernateUtil.getSession();
		List<Pet> petList = ses.createQuery("from Pet", Pet.class).list();
		return petList;
	}
	

}
