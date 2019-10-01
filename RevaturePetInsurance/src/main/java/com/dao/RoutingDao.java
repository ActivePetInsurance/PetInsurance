package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Routing;

@Transactional
@Repository("routDao")
public class RoutingDao {
	
	private SessionFactory sesFact;
	
	public RoutingDao() {
		
	}
	
	@Autowired	
	public RoutingDao(SessionFactory sesFact) {
		this.sesFact = sesFact;
	}
	
	public void insert (Routing myRouting) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.save(myRouting);
//		tx.commit();
		sesFact.getCurrentSession().save(myRouting);
		
	}
	public void update (Routing myRouting) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.update(myRouting);
//		tx.commit();
		sesFact.getCurrentSession().update(myRouting);
	}
	
	public List<Routing> selectAll(){
//		Session ses = HibernateUtil.getSession();
//		List<Routing> petList = ses.createQuery("from Routing", Routing.class).list();
		return sesFact.getCurrentSession().createQuery("from Routing", Routing.class).list();
	}
	
	public Routing selectInsurancePlanByID(int insurancePlanId) {
//		Session ses = HibernateUtil.getSession();
//		Routing ip = ses.get(Routing.class, insurancePlanId);
		return sesFact.getCurrentSession().get(Routing.class, insurancePlanId);
		
	}


}
