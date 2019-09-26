package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Policy;
import com.util.HibernateUtil;

public class PolicyDao {
	
	public void insert (Policy myPolicy) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(myPolicy);
		tx.commit();
		
	}
	public void update (Policy myPolicy) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(myPolicy);
		tx.commit();
	}
	
	public List<Policy> selectAll(){
		Session ses = HibernateUtil.getSession();
		List<Policy> petList = ses.createQuery("from Policy", Policy.class).list();
		return petList;
	}
	
	public Policy selectInsurancePlanByID(int insurancePlanId) {
		Session ses = HibernateUtil.getSession();
		Policy ip = ses.get(Policy.class, insurancePlanId);
		return ip;
		
	}


}
