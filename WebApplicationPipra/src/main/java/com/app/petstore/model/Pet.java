package com.app.petstore.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "petstore")
public class Pet implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addpet;
	private String petIn;
	private String petName;
	private String petDesc;
	private Boolean petRequired;
	public Pet() {
		super();
	}
	public Pet(Integer addpet, String petIn, String petName, String petDesc, Boolean petRequired) {
		super();
		this.addpet = addpet;
		this.petIn = petIn;
		this.petName = petName;
		this.petDesc = petDesc;
		this.petRequired = petRequired;
	}
	public Integer getAddpet() {
		return addpet;
	}
	public void setAddpet(Integer addpet) {
		this.addpet = addpet;
	}
	public String getPetIn() {
		return petIn;
	}
	public void setPetIn(String petIn) {
		this.petIn = petIn;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetDesc() {
		return petDesc;
	}
	public void setPetDesc(String petDesc) {
		this.petDesc = petDesc;
	}
	public Boolean getPetRequired() {
		return petRequired;
	}
	public void setPetRequired(Boolean petRequired) {
		this.petRequired = petRequired;
	}
	@Override
	public String toString() {
		return "Pet [addpet=" + addpet + ", petIn=" + petIn + ", petName=" + petName + ", petDesc=" + petDesc
				+ ", petRequired=" + petRequired + "]";
	}

	
	
	
}
