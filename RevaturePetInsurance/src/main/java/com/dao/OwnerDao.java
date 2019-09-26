package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Owner;
import com.util.HibernateUtil;

public class OwnerDao {
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void insert (Owner myOwner) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(myOwner);
		tx.commit();
		
	}
	public void update (Owner myOwner) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(myOwner);
		tx.commit();
	}
	
	public List<Owner> selectAll(){
		Session ses = HibernateUtil.getSession();
		List<Owner> petList = ses.createQuery("from Owner", Owner.class).list();
		return petList;
	}
	
	public Owner selectInsurancePlanByID(int insurancePlanId) {
		Session ses = HibernateUtil.getSession();
		Owner ip = ses.get(Owner.class, insurancePlanId);
		return ip;
		
	}
	
	public Owner selectOwnerByEmail(String ownerEmail){
		Session ses = HibernateUtil.getSession();
		Owner ow = ses.createQuery("from Owner where ownerEmail='" 
					+ ownerEmail + "'", Owner.class).uniqueResult();
		return ow;

	}


}
