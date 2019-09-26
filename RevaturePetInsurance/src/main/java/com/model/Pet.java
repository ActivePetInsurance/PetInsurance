package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Pet {

	@Id
	@Column(name = "pet_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int petId;

	@Column(name = "pet_name")
	private String name;

	private String dob;

	private double weight;

	private double height;

	private int age;

	/*
	 * private int ownerId;
	 * 
	 * private OwnerModel owner;
	 * 
	 */
	/*
	 * private int sizeId;
	 * 
	 * private PetSizeModel size;
	 * 
	 * private int sexId;
	 * 
	 * private PetSexModel sex;
	 * 
	 * private int typeId;
	 * 
	 * private PetTypeModel type;
	 */

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * public int getOwnerId() { return ownerId; }
	 * 
	 * public void setOwnerId(int ownerId) { this.ownerId = ownerId; }
	 * 
	 * public OwnerModel getOwner() { return owner; }
	 * 
	 * public void setOwner(OwnerModel owner) { this.owner = owner; }
	 */

	/*
	 * public int getSizeId() { return sizeId; }
	 * 
	 * public void setSizeId(int sizeId) { this.sizeId = sizeId; }
	 * 
	 * public PetSizeModel getSize() { return size; }
	 * 
	 * public void setSize(PetSizeModel size) { this.size = size; }
	 * 
	 * public int getSexId() { return sexId; }
	 * 
	 * public void setSexId(int sexId) { this.sexId = sexId; }
	 * 
	 * public PetSexModel getSex() { return sex; }
	 * 
	 * public void setSex(PetSexModel sex) { this.sex = sex; }
	 * 
	 * public int getTypeId() { return typeId; }
	 * 
	 * public void setTypeId(int typeId) { this.typeId = typeId; }
	 * 
	 * public PetTypeModel getType() { return type; }
	 * 
	 * public void setType(PetTypeModel type) { this.type = type; }
	 */
	@Override
	public String toString() {
		return "PetModel [petId=" + petId + ", name=" + name + ", dob=" + dob + ", weight=" + weight + ", height="
				+ height + ", age="
				+ age /* ", ownerId=" + ownerId + ", owner=" + owner + */ /*
																			 * ", sizeId=" + sizeId + ", size=" + size +
																			 * ", sexId=" + sexId + ", sex=" + sex +
																			 * ", typeId=" + typeId + ", type=" + type +
																			 * "]"
																			 */;
	}

	public Pet(int petId, String name) {
		super();
		this.petId = petId;
		this.name = name;
	}

	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

}
