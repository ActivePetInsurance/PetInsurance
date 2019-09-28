package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.PetSex;

@Transactional
@Repository("petSexDao")
public class PetSexDao {
	
	private SessionFactory sesFact;
	
	public PetSexDao() {
		
	}
	
	@Autowired
	public PetSexDao(SessionFactory sesFact) {
		this.sesFact = sesFact;
	}
	
	public void insert (PetSex myPetSex) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.save(myPetSex);
//		tx.commit();
		sesFact.getCurrentSession().save(myPetSex);
		
	}
	public void update (PetSex myPetSex) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.update(myPetSex);
//		tx.commit();
		sesFact.getCurrentSession().update(myPetSex);
	}
	
	public List<PetSex> selectAll(){
//		Session ses = HibernateUtil.getSession();
//		List<PetSex> petList = ses.createQuery("from PetSex", PetSex.class).list();
		return sesFact.getCurrentSession().createQuery("from PetSex", PetSex.class).list();
	}
	
	public PetSex selectInsurancePlanByID(int insurancePlanId) {
//		Session ses = HibernateUtil.getSession();
//		PetSex ip = ses.get(PetSex.class, insurancePlanId);
		return sesFact.getCurrentSession().get(PetSex.class, insurancePlanId);
		
	}

}
