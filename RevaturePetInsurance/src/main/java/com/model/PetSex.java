package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PetSex {

	@Id
	@Column(name = "sex_id")
	private int sexId;

	@Column(name = "sex")
	private String sex;

	public int getSexId() {
		return sexId;
	}

	public void setSexId(int sexId) {
		this.sexId = sexId;
	}

	public String getSex() {
		return sex;
	}

	public void setSize(String sex) {
		this.sex = sex;
	}

	public PetSex(int sexId, String sex) {
		this.sexId = sexId;
		this.sex = sex;
	}

	public PetSex() {
	}

	@Override
	public String toString() {
		return "PetSex [sexId=" + sexId + ", sex=" + sex + "]";
	}



}
