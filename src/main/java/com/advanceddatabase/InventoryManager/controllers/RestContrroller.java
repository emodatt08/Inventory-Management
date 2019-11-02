package com.advanceddatabase.InventoryManager.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestContrroller {
	
	@GetMapping("/test")
	public String getSomething(){
		return "turing";
	}
}
