package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Routing;
import com.util.HibernateUtil;

public class RoutingDao {
	public void insert (Routing myRouting) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(myRouting);
		tx.commit();
		
	}
	public void update (Routing myRouting) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(myRouting);
		tx.commit();
	}
	
	public List<Routing> selectAll(){
		Session ses = HibernateUtil.getSession();
		List<Routing> petList = ses.createQuery("from Routing", Routing.class).list();
		return petList;
	}
	
	public Routing selectInsurancePlanByID(int insurancePlanId) {
		Session ses = HibernateUtil.getSession();
		Routing ip = ses.get(Routing.class, insurancePlanId);
		return ip;
		
	}


}
