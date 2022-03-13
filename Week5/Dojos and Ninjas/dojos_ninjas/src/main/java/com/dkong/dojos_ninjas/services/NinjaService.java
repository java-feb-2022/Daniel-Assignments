package com.dkong.dojos_ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dkong.dojos_ninjas.models.Ninja;
import com.dkong.dojos_ninjas.repositories.NinjaRepo;

@Service
public class NinjaService {
	@Autowired
	private final NinjaRepo ninjaRepo;
	
	public NinjaService(NinjaRepo ninjaRepo) {
		this.ninjaRepo=ninjaRepo;
	}
	
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public Ninja findNinja(Long id) {
		Optional<Ninja> optNinja = ninjaRepo.findById(id);
		if(optNinja.isPresent()) {
			return optNinja.get();
		} else {
			return null;
		}
	}
	
	public List<Ninja> ninjasFromDojo(Long id) {
		return ninjaRepo.findByDojo(id);
	}
}
