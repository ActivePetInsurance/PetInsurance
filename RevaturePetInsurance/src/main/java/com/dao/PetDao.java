package com.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Pet;
import com.model.Policy;
import com.util.HibernateUtil;

@Transactional
@Repository("petDao")
public class PetDao {
	
	private SessionFactory sesFact;
	
	public PetDao() {
		
	}
	
	@Autowired
	public PetDao(SessionFactory sesFact) {
		this.sesFact=sesFact;
	}
	
	public void insert (Pet myPet) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.save(myPet);
//		tx.commit();
		sesFact.getCurrentSession().save(myPet);
		sesFact.getCurrentSession().clear();
	}
	public void update (Pet myPet) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.update(myPet);
//		tx.commit();
		sesFact.getCurrentSession().update(myPet);
	}
	
	public List<Pet> selectAll(){
//		Session ses = HibernateUtil.getSession();
//		List<Pet> petList = ses.createQuery("from Pet", Pet.class).list();
		return sesFact.getCurrentSession().createQuery("from Pet", Pet.class).list();
	}
	
	public List<Pet> selectByOwnerId(int oId) {
		return sesFact.getCurrentSession().createQuery("from Pet where owner_fk ='"+oId+"'", Pet.class).list();
		
	}
	
	public Pet selectById(int petId){
//		Session ses = HibernateUtil.getSession();
//		List<Pet> petList = ses.createQuery("from Pet", Pet.class).list();
		return sesFact.getCurrentSession().get(Pet.class, petId);
	}
	
}
