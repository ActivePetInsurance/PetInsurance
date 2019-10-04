package com.servlet;

import com.dao.OwnerDao;
import com.model.Owner;

public class InsertOwner {

	public static OwnerDao od = new OwnerDao();
	
	public static void InsertOwners() {
		Owner o1 = new Owner(123, "jane", "d", "doe", "12/15/1996", "1238 N 89nd Way", "Denver", "CO", 84939, "602-957-9874", "janeddoe@gmail.com", "password" );
		Owner o2 = new Owner(123, "john", "j", "doe", "12/15/1986", "1325 N 83nd St", "Denver", "CO", 84919, "180-957-9874", "johnjdoe@gmail.com", "p4ssword" );
		
		od.insert(o1);
		od.insert(o2);
	}
}
