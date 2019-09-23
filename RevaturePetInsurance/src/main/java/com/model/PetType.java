package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PetType {

	@Id
	@Column(name = "type_id")
	private int typeId;

	@Column(name = "type")
	private String type;

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public PetType(int typeId, String type) {
		this.typeId = typeId;
		this.type = type;
	}

	public PetType() {
	}

	@Override
	public String toString() {
		return "PetType [typeId=" + typeId + ", type=" + type + "]";
	}
}
