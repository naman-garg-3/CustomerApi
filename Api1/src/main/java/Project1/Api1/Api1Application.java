package Project1.Api1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Project1.Api1.entity.Customer;
import Project1.Api1.repository.repository;

@SpringBootApplication
public class Api1Application implements CommandLineRunner{

	
	@Autowired
	repository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(Api1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Customer c1=new Customer(1,"Naman","n@gmail.com",9530,"Jaipur");
		repository.customer.addAll(Arrays.asList(c1));
	}

}
