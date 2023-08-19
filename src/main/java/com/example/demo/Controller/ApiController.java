package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@Value("${message}")
	private String message;
	@GetMapping("/")
	public String display()
	{
		return "My message is: "+message;
	}
}
