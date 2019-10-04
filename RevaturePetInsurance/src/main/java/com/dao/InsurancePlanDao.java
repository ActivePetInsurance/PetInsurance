package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.InsurancePlan;
import com.util.HibernateUtil;

@Transactional
@Repository("insurPlanDao")
public class InsurancePlanDao {
	
	private SessionFactory sesFact;
	
	public InsurancePlanDao() {
		
	}
	
	@Autowired
	public InsurancePlanDao(SessionFactory sesFact) {
		this.sesFact = sesFact;
	}
	
	
	public void insert (InsurancePlan myInsurancePlan) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.save(myInsurancePlan);
//		tx.commit();
		sesFact.getCurrentSession().save(myInsurancePlan);
	}
	public void update (InsurancePlan myInsurancePlan) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.update(myInsurancePlan);
//		tx.commit();
		sesFact.getCurrentSession().update(myInsurancePlan);
	}
	
	public List<InsurancePlan> selectAll(){
//		Session ses = HibernateUtil.getSession();
//		List<InsurancePlan> petList = ses.createQuery("from InsurancePlan", InsurancePlan.class).list();
		return sesFact.getCurrentSession().createQuery("from InsurancePlan", InsurancePlan.class).list();
	}
	
	public InsurancePlan selectInsurancePlanByID(int insurancePlanId) {
//		Session ses = HibernateUtil.getSession();
//		InsurancePlan ip = ses.get(InsurancePlan.class, insurancePlanId);
		return sesFact.getCurrentSession().get(InsurancePlan.class, insurancePlanId);
		
	}
	


	
	
	
	
	
	
}
