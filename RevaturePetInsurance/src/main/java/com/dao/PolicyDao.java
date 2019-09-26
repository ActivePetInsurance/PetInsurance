package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Policy;

@Transactional
@Repository("policyDao")
public class PolicyDao {
	
	private SessionFactory sesFact;
	
	public PolicyDao() {
		
	}
	
	@Autowired
	public PolicyDao(SessionFactory sesFact) {
		this.sesFact = sesFact;
	}
	
	public void insert (Policy myPolicy) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.save(myPolicy);
//		tx.commit();
		sesFact.getCurrentSession().save(myPolicy);
		
	}
	
	public void update (Policy myPolicy) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.update(myPolicy);
//		tx.commit();
		sesFact.getCurrentSession().update(myPolicy);
	}
	
	public List<Policy> selectAll(){
//		Session ses = HibernateUtil.getSession();
//		List<Policy> petList = ses.createQuery("from Policy", Policy.class).list();
		return sesFact.getCurrentSession().createQuery("from Policy", Policy.class).list();
	}
	
	public Policy selectInsurancePlanByID(int insurancePlanId) {
//		Session ses = HibernateUtil.getSession();
//		Policy ip = ses.get(Policy.class, insurancePlanId);
		return sesFact.getCurrentSession().get(Policy.class, insurancePlanId);
		
	}


}
