package com.app.petstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.petstore.model.Pet;
import com.app.petstore.repo.PetRepository;
import com.app.petstore.service.PetService;
@Service
public class PetServiceImpl implements PetService {
	@Autowired
	PetRepository petRepo;

	public String savePet(Pet pet) {
		String message = null;
		if (pet != null) {
			petRepo.save(pet);
			return message = "Pet is stored successfully !";
		} else {
			return message = "Pet is not stored successfully !";

		}
	}

	public Pet getPet(Integer id) {
		Pet pet  = null;
		if (id != null) {
			 try {
				pet = petRepo.getById(id);
			} catch (Exception e) {
				
			}
			return pet;
		} else {
			return pet;

		}
	}

	public Pet updatePet(Integer id, Pet pet) {
		Pet petByID = petRepo.getById(id);
		petByID.setAddpet(pet.getAddpet());
		petByID.setPetDesc(pet.getPetDesc());
		petByID.setPetIn(pet.getPetIn());
		petByID.setPetRequired(pet.getPetRequired());
		Pet updatedPet = petRepo.save(petByID);
		return updatedPet;
	}

	public String deletePet(Integer id) {
         
		String message = null;
		if (id != null) {
		petRepo.deleteById(id);
		return "Pet deleted succesfully !!!";
		}
		else {
			return  "Pet deleted succesfully !!!";
			}
	
	}

}
