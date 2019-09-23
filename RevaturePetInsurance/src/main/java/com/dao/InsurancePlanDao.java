package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.InsurancePlan;
import com.util.HibernateUtil;

public class InsurancePlanDao {
	
	public void insert (InsurancePlan myInsurancePlan) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(myInsurancePlan);
		tx.commit();
		
	}
	public void update (InsurancePlan myInsurancePlan) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(myInsurancePlan);
		tx.commit();
	}
	
	public List<InsurancePlan> selectAll(){
		Session ses = HibernateUtil.getSession();
		List<InsurancePlan> petList = ses.createQuery("from InsurancePlan", InsurancePlan.class).list();
		return petList;
	}
	
	public InsurancePlan selectInsurancePlanByID(int insurancePlanId) {
		Session ses = HibernateUtil.getSession();
		InsurancePlan ip = ses.get(InsurancePlan.class, insurancePlanId);
		return ip;
		
	}
	


	
	
	
	
	
	
}
