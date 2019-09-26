package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.CreditCard;
import com.util.HibernateUtil;

public class CreditCardDao {
	
	public void insert (CreditCard myCreditCard) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(myCreditCard);
		tx.commit();
		
	}
	public void update (CreditCard myCreditCard) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(myCreditCard);
		tx.commit();
	}
	
	public List<CreditCard> selectAll(){
		Session ses = HibernateUtil.getSession();
		List<CreditCard> petList = ses.createQuery("from CreditCard", CreditCard.class).list();
		return petList;
	}
	
	public CreditCard selectCreditCardByID(int creditCardId) {
		Session ses = HibernateUtil.getSession();
		CreditCard ip = ses.get(CreditCard.class, creditCardId);
		return ip;
		
	}


}
