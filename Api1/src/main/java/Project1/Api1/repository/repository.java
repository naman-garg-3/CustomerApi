package Project1.Api1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Project1.Api1.entity.Customer;

@Repository
public class repository {

	public List<Customer> customer = new ArrayList<>();

	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return customer;
	}
}
