package com.tcs.democrud;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.democrud.entity.Employee;
import com.tcs.democrud.repository.TcsRepository;

@SpringBootApplication

public class DemoCrudApplication implements CommandLineRunner {
	
	@Autowired
	TcsRepository tcsRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(DemoCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee(1, "Shubh", "Yavatmal");
		Employee e2 = new Employee(2, "Virat", "Mumbai");
		
		tcsRepository.employee.addAll(Arrays.asList(e1, e2));
	}
	
	
//http://localhost:8080/emp/get/all
}
