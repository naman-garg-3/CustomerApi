package Project1.Api1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project1.Api1.entity.Customer;
import Project1.Api1.repository.repository;

@Service
public class service {
	
	@Autowired
	repository repository;

	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return repository.getAll();
	}

}
