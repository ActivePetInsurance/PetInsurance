package com.service;

import java.util.List;

import com.model.InsurancePlan;

public interface InsurancePlanService {
	
	public List<InsurancePlan> selectAllPlans();
	
	public InsurancePlan selectPlanById(int iId);
	

}
