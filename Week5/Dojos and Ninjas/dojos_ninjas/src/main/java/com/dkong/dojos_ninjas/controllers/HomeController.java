package com.dkong.dojos_ninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dkong.dojos_ninjas.models.Dojo;
import com.dkong.dojos_ninjas.models.Ninja;
import com.dkong.dojos_ninjas.services.DojoService;
import com.dkong.dojos_ninjas.services.NinjaService;

@Controller
public class HomeController {
	@Autowired
	private DojoService dojoService;
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/")
	public String dojos(@ModelAttribute("dojo") Dojo dojo, Model model, @ModelAttribute("ninja") Ninja ninja) {
		model.addAttribute("dojos", dojoService.allDojos());
		return "dojos.jsp";
	}
	
	@PostMapping("/")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo, Model model, @ModelAttribute("ninja") Ninja ninja) {
		model.addAttribute("dojos", dojoService.allDojos());
		dojoService.createDojo(dojo);
		return "redirect:/";
	}
	
	@GetMapping("/ninjas/{id}")
	public String dojoNinjas(Model model, @PathVariable(value="id") Long id, @ModelAttribute("ninja") Ninja ninja) {
//		List<Ninja> ninjas=ninjaService.ninjasFromDojo(id);
		Dojo dojo=dojoService.findDojo(id);
		model.addAttribute("dojo", dojo);
//		model.addAttribute("ninjas", ninjas);
		return "ninjas.jsp";
	}
	
	@GetMapping("/newNinja")
	public String newNinja(Model model, @ModelAttribute("ninja") Ninja ninja, @ModelAttribute("dojo") Dojo dojo) {
		model.addAttribute("dojos", dojoService.allDojos());
		return "newNinja.jsp";
	}
	
//	@PostMapping("/ninjas/{id}")
//	public String createNinja(Model model, @PathVariable(value="id") Long id, @ModelAttribute("ninja") Ninja ninja, @ModelAttribute("dojo") Dojo dojo) {
//		model.addAttribute("dojos", dojoService.allDojos());
//		ninjaService.createNinja(ninja);
//		Long ninjaDojoId = ninja.getDojo().getId();
//		return "redirect:/";
//	}
	
	@PostMapping("/ninjas")
	public String createNewNinja(Model model, @ModelAttribute("ninja") Ninja ninja, @ModelAttribute("dojo") Dojo dojo) {
		model.addAttribute("dojos", dojoService.allDojos());
		ninjaService.createNinja(ninja);
//		Long ninjaDojoId = ninja.getDojo().getId();
		return "redirect:/";
	}
}
