package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pet_size")
public class PetSize {
	
	@Id
	@Column(name = "size_id")
	private int sizeId;

	@Column(name = "size")
	private String size;

	public int getSizeId() {
		return sizeId;
	}

	public void setSizeId(int sizeId) {
		this.sizeId = sizeId;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public PetSize(int sizeId, String size) {
		this.sizeId = sizeId;
		this.size = size;
	}

	public PetSize() {
	}

	@Override
	public String toString() {
		return "PetSize [sizeId=" + sizeId + ", size=" + size + "]";
	}

}
