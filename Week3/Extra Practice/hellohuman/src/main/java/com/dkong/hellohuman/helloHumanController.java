package com.dkong.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloHumanController {

	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false) String fname, String lname) {
		if(fname == null) {
			fname = "Human";
		} 
		if(lname == null) {
			lname = "";
		}
		return "Hello " + fname + " " + lname;
		
	}
}
