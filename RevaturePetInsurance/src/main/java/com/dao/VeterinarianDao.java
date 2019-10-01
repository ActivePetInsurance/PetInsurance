package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Veterinarian;
import com.util.HibernateUtil;

@Transactional
@Repository("vetDao")
public class VeterinarianDao {

	private SessionFactory sesFact;

	public VeterinarianDao() {

	}

	@Autowired
	public VeterinarianDao(SessionFactory sesFact) {
		this.sesFact = sesFact;
	}

	public void insert(Veterinarian myVeterinarian) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.save(myVeterinarian);
//		tx.commit();
		sesFact.getCurrentSession().save(myVeterinarian);
	}

	public void update(Veterinarian myVeterinarian) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.update(myVeterinarian);
//		tx.commit();
		sesFact.getCurrentSession().save(myVeterinarian);
	}

	public List<Veterinarian> selectAll() {
//		Session ses = HibernateUtil.getSession();
//		List<Veterinarian> petList = ses.createQuery("from Veterinarian", Veterinarian.class).list();
		return sesFact.getCurrentSession().createQuery("from Veterinarian", Veterinarian.class).list();
	}

	public Veterinarian selectInsurancePlanByID(int insurancePlanId) {
//		Session ses = HibernateUtil.getSession();
//		Veterinarian ip = ses.get(Veterinarian.class, insurancePlanId);
		return sesFact.getCurrentSession().get(Veterinarian.class, insurancePlanId);

	}

}
