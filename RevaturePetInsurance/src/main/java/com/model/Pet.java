package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pet {

	@Id
	@Column(name = "pet_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int petId;

	@Column(name = "pet_name")
	private String name;
	
	@Column(name = "date_of_birth")
	private String dob;
	
	@Column(name="weight")
	private double weight;
	
	@Column(name = "height")
	private double height;
	
	@Column(name = "age")
	private int age;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch =FetchType.EAGER)
	@JoinColumn(name = "owner_fk")
	private Owner owner;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch =FetchType.EAGER)
	@JoinColumn(name="size_fk")
	private PetSize size;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch =FetchType.EAGER)
	@JoinColumn(name="sex_fk")
	private PetSex sex;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch =FetchType.EAGER)
	@JoinColumn(name="type_fk")
	private PetType type;

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

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public PetSize getSize() {
		return size;
	}

	public void setSize(PetSize size) {
		this.size = size;
	}

	public PetSex getSex() {
		return sex;
	}

	public void setSex(PetSex sex) {
		this.sex = sex;
	}

	public PetType getType() {
		return type;
	}

	public void setType(PetType type) {
		this.type = type;
	}

	public Pet() {
	}

	public Pet(int petId, String name, String dob, double weight, double height, int age, Owner owner, PetSize size,
			PetSex sex, PetType type) {
		super();
		this.petId = petId;
		this.name = name;
		this.dob = dob;
		this.weight = weight;
		this.height = height;
		this.age = age;
		this.owner = owner;
		this.size = size;
		this.sex = sex;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", name=" + name + ", dob=" + dob + ", weight=" + weight + ", height=" + height
				+ ", age=" + age + ", owner=" + owner + ", size=" + size + ", sex=" + sex + ", type=" + type + "]";
	}

	
	
	
}
