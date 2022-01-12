package com.app.petstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "petstore")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addpet;
	private String petIn;
	private String petName;
	private String petDesc;
	private Boolean petRequired;
	
}
