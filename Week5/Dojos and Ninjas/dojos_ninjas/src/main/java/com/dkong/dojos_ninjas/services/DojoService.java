package com.dkong.dojos_ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dkong.dojos_ninjas.models.Dojo;
import com.dkong.dojos_ninjas.repositories.DojoRepo;

@Service
public class DojoService {
	
	@Autowired
	private final DojoRepo dojoRepo;
	
	public DojoService(DojoRepo dojoRepo) {
		this.dojoRepo=dojoRepo;
	}
	
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> optDojo = dojoRepo.findById(id);
		if (optDojo.isPresent()) {
			return optDojo.get();
		} else {
			return null;
		}
	}
	
}
