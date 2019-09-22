package com.servlet;

import com.dao.InsurancePlanDao;
import com.model.InsurancePlan;

public class InsertInsurancePlans {
	
	public static InsurancePlanDao ipd = new InsurancePlanDao();
	
	public static void InsertInitialInsurancePlans() {
		
		InsurancePlan roa = new InsurancePlan(1, "Rodent A");
		InsurancePlan rob = new InsurancePlan(2, "Rodent B");
		InsurancePlan roc = new InsurancePlan(3, "Rodent C");
		InsurancePlan ba = new InsurancePlan(4, "Bird A");
		InsurancePlan bb = new InsurancePlan(5, "Bird B");
		InsurancePlan bc = new InsurancePlan(6, "Bird C");
		InsurancePlan rea = new InsurancePlan(7, "Reptile A");
		InsurancePlan reb = new InsurancePlan(8, "Reptile B");
		InsurancePlan rec = new InsurancePlan(9, "Reptile C");
		InsurancePlan roaw = new InsurancePlan(10, "Rodent A + Wellness");
		InsurancePlan robw = new InsurancePlan(11, "Rodent B + Wellness");
		InsurancePlan rocw = new InsurancePlan(12, "Rodent C + Wellness");
		InsurancePlan baw = new InsurancePlan(13, "Bird A + Wellness");
		InsurancePlan bbw = new InsurancePlan(14, "Bird B + Wellness");
		InsurancePlan bcw = new InsurancePlan(15, "Bird C + Wellness");
		InsurancePlan reaw = new InsurancePlan(16, "Reptile A + Wellness");
		InsurancePlan rebw = new InsurancePlan(17, "Reptile B + Wellness");
		InsurancePlan recw = new InsurancePlan(18, "Reptile C + Wellness");
		
		ipd.insert(roa);
		ipd.insert(rob);
		ipd.insert(roc);
		ipd.insert(ba);
		ipd.insert(bb);
		ipd.insert(bc);
		ipd.insert(rea);
		ipd.insert(reb);
		ipd.insert(rec);
		ipd.insert(roaw);
		ipd.insert(robw);
		ipd.insert(rocw);
		ipd.insert(baw);
		ipd.insert(bbw);
		ipd.insert(bcw);
		ipd.insert(reaw);
		ipd.insert(rebw);
		ipd.insert(recw);
		
	}

}
