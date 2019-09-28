package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.CreditCard;

@Transactional
@Repository("credCardDao")
public class CreditCardDao {
	
	private SessionFactory sesFact;
	
	public CreditCardDao() {
		
	}
	
	@Autowired
	public CreditCardDao(SessionFactory sesFact) {
		this.sesFact = sesFact;
	}
	
	public void insert (CreditCard myCreditCard) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.save(myCreditCard);
//		tx.commit();
		sesFact.getCurrentSession().save(myCreditCard);
		
	}
	public void update (CreditCard myCreditCard) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.update(myCreditCard);
//		tx.commit();
		sesFact.getCurrentSession().update(myCreditCard);
	}
	
	public List<CreditCard> selectAll(){
//		Session ses = HibernateUtil.getSession();
//		List<CreditCard> petList = ses.createQuery("from CreditCard", CreditCard.class).list();
		return sesFact.getCurrentSession().createQuery("from CreditCard", CreditCard.class).list();
	}
	
	public CreditCard selectInsurancePlanByID(int insurancePlanId) {
//		Session ses = HibernateUtil.getSession();
//		CreditCard ip = ses.get(CreditCard.class, insurancePlanId);
		return sesFact.getCurrentSession().get(CreditCard.class, insurancePlanId);
		
	}


}
