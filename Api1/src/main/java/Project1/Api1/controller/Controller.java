package Project1.Api1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Project1.Api1.entity.Customer;
import Project1.Api1.service.service;

@RestController
@RequestMapping("/customers")
public class Controller {
	
	@Autowired
	service service;
	
	@GetMapping("/get/all")
	public List<Customer> getAll(){
		return service.getAll();
		
	}
}

