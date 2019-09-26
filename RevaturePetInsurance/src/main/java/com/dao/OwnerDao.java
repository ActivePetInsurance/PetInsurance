package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Owner;
import com.util.HibernateUtil;

public class OwnerDao {
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
	
	public Owner selectOwnerbyId(int ownerId) {
		Session ses = HibernateUtil.getSession();
		Owner ow = ses.get(Owner.class, ownerId);
		return ow;
		
	}
	
	public Owner selectOwnerByEmail(String ownerEmail){
		Session ses = HibernateUtil.getSession();
		Owner ow = ses.get(Owner.class, ownerEmail);
		return ow;
	}


}
