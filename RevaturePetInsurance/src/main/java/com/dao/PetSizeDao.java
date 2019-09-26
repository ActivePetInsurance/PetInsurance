package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.PetSize;
import com.util.HibernateUtil;

@Transactional
@Repository("foodRepo")
public class PetSizeDao {
	
	private SessionFactory sesFact;
	
	public PetSizeDao() {
		
	}
	
	public PetSizeDao(SessionFactory sesFact) {
		this.sesFact = sesFact;
	}
	
	public void insert (PetSize myPetSize) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.save(myPetSize);
//		tx.commit();
		sesFact.getCurrentSession().save(myPetSize);
		
	}
	public void update (PetSize myPetSize) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.update(myPetSize);
//		tx.commit();
		sesFact.getCurrentSession().update(myPetSize);
	}
	
	public List<PetSize> selectAll(){
//		Session ses = HibernateUtil.getSession();
//		List<PetSize> petList = ses.createQuery("from PetSize", PetSize.class).list();
		return sesFact.getCurrentSession().createQuery("from PetSize", PetSize.class).list();
	}
	
	public PetSize selectInsurancePlanByID(int insurancePlanId) {
//		Session ses = HibernateUtil.getSession();
//		PetSize ip = ses.get(PetSize.class, insurancePlanId);
		return sesFact.getCurrentSession().get(PetSize.class, insurancePlanId);
		
	}
}
