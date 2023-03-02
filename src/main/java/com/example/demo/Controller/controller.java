package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {
	@GetMapping("/home")
	public String disp(@RequestParam String name , @RequestParam String town) {
		return "hi i am "+name+" from "+town;
		
	}
	

}
