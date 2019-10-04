package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.InsurancePlanDao;
import com.model.InsurancePlan;

@Service ("planService")
public class InsurancePlanServiceImpl implements InsurancePlanService {
		
		private InsurancePlanDao iPD;
		
		public InsurancePlanServiceImpl() {
			// TODO Auto-generated constructor stub
		}

		@Autowired
		public InsurancePlanServiceImpl(InsurancePlanDao iPD) {
			super();
			this.iPD = iPD;
		}

		@Override
		public List<InsurancePlan> selectAllPlans() {
			
			return iPD.selectAll();
		}

		@Override
		public InsurancePlan selectPlanById(int iId) {
			
			return iPD.selectInsurancePlanByID(iId);
		}
}
