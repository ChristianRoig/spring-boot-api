package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@Autowired
	BuildProperties buildProperties;
	
	
	@GetMapping("/test")
	public String test() {
		return "Hola Mundo!";
	}
	
    @GetMapping("/project-info")
    public String getProjectInfo() {
    	return "Nombre del proyecto: " + buildProperties.getName() + 
    			"\nVersion de proyecto: " + buildProperties.getVersion() + 
    			"\nVersion de Java: " + buildProperties.get("java.version") +
    			"\nVersion de Spring Boot: " + buildProperties.get("springboot.version");
    }
	
}