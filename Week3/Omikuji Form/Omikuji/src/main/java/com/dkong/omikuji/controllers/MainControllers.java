package com.dkong.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainControllers {

	@GetMapping("/omikuji")
	public String omikuji(HttpSession session) {
		
		
		return "omikuji.jsp";
	}
	
	@PostMapping("/omikuji/process")
	public String processOmikuji(HttpSession session,
			@RequestParam(value="number") Integer number, 
			@RequestParam(value="cityName") String cityName,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="livingThing")String livingThing,
			@RequestParam(value="somethingNice") String somethingNice) {
		
		session.setAttribute("number", number);
		session.setAttribute("cityName", cityName);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("somethingNice", somethingNice);
		
		return "redirect:/omikuji/show";
	}
	
	@GetMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
		
		Integer number = (Integer) session.getAttribute("number");
		String cityName = (String) session.getAttribute("cityName");
		String person = (String) session.getAttribute("person");
		String hobby = (String) session.getAttribute("hobby");
		String livingThing = (String) session.getAttribute("livingThing");
		String somethingNice = (String) session.getAttribute("somethingNice");
		
		model.addAttribute("number", number);
		model.addAttribute("cityName", cityName);
		model.addAttribute("person", person);
		model.addAttribute("hobby", hobby);
		model.addAttribute("livingThing", livingThing);
		model.addAttribute("somethingNice", somethingNice);
		
		return "show.jsp";
	}
}
