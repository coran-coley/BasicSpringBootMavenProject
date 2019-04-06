package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operations")
public class MainRestController {
	@GetMapping(value = "/status")
	public String programStatus () {
		String response = "Maven: Alive and well!";
		return response;
	}

}
