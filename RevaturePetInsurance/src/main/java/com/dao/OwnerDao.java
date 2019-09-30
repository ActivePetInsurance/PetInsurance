package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Owner;
import com.util.HibernateUtil;

@Transactional
@Repository("ownDao")
public class OwnerDao {
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private SessionFactory sesFact;
	
	public OwnerDao() {
		
	}
	
	@Autowired
	public OwnerDao(SessionFactory sesFact) {
		this.sesFact = sesFact;
	}
	
	public void insert (Owner myOwner) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.save(myOwner);
//		tx.commit();
		sesFact.getCurrentSession().save(myOwner);
	}
	
	public void update (Owner myOwner) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.update(myOwner);
//		tx.commit();
		sesFact.getCurrentSession().update(myOwner);
	}
	
	public List<Owner> selectAll(){
//		Session ses = HibernateUtil.getSession();
//		List<Owner> petList = ses.createQuery("from Owner", Owner.class).list();
//		return petList;
		return sesFact.getCurrentSession().createQuery("from Owner", Owner.class).list();
	}
	

	public Owner selectInsurancePlanByID(int insurancePlanId) {
//		Session ses = HibernateUtil.getSession();
//		Owner ip = ses.get(Owner.class, insurancePlanId);
		return sesFact.getCurrentSession().get(Owner.class, insurancePlanId);

		
	}
	
	public Owner selectOwnerByID(int oId) {
//		Session ses = HibernateUtil.getSession();
//		Owner ip = ses.get(Owner.class, insurancePlanId);
		return sesFact.getCurrentSession().get(Owner.class, oId);
		
	}
	
	public Owner selectOwnerByEmail(String ownerEmail){
//		Session ses = HibernateUtil.getSession();
//		Owner ow = ses.createQuery("from Owner where ownerEmail='" 
//					+ ownerEmail + "'", Owner.class).uniqueResult();
		return sesFact.getCurrentSession().createQuery("from Owner where ownerEmail='"+ ownerEmail + "'", Owner.class).uniqueResult();

	}


}
