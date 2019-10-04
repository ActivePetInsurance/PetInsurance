package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.PetType;
import com.util.HibernateUtil;

@Transactional
@Repository("petTypeDao")
public class PetTypeDao {
	
	private SessionFactory sesFact;
	
	public PetTypeDao() {
		
	}
	
	@Autowired
	public PetTypeDao(SessionFactory sesFact) {
		this.sesFact=sesFact;
	}
	
	public void insert (PetType myPetType) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.save(myPetType);
//		tx.commit();
		sesFact.getCurrentSession().save(myPetType);
	}
	public void update (PetType myPetType) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.update(myPetType);
//		tx.commit();
		sesFact.getCurrentSession().update(myPetType);
	}
	
	public List<PetType> selectAll(){
//		Session ses = HibernateUtil.getSession();
//		List<PetType> petList = ses.createQuery("from PetType", PetType.class).list();
		return sesFact.getCurrentSession().createQuery("from PetType", PetType.class).list();
	}
	
	public PetType selectInsurancePlanByID(int insurancePlanId) {
//		Session ses = HibernateUtil.getSession();
//		PetType ip = ses.get(PetType.class, insurancePlanId);
		return sesFact.getCurrentSession().get(PetType.class, insurancePlanId);
		
	}

}
