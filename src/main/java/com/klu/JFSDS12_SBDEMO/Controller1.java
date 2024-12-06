package com.klu.JFSDS12_SBDEMO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 
{
	@GetMapping("/")
	public String method1()
	{
		return "IT's RAINING";
		
	}


}
