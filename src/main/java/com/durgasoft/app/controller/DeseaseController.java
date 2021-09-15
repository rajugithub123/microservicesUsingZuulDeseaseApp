package com.durgasoft.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apis")
public class DeseaseController {
	@GetMapping(value="/helloDesease")
	public String desease() {
		return "hello Desesse";
	}
	

}
