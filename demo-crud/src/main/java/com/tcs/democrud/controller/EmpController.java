package com.tcs.democrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.democrud.entity.Employee;
import com.tcs.democrud.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	//get
	@GetMapping("/get/all")
	public List<Employee> getAll(){
		return empService.getAll();
	}
	
	//create
	@PostMapping("/add")
	public String add(@RequestBody Employee emp){
		return empService.add(emp);
	}
	
	//Put
	@PutMapping("/edit")
	public String edit(@RequestBody Employee emp){
		return empService.edit(emp);
	}
	
	//Delete
	@DeleteMapping("/delete")
	public String delete(@RequestParam int empNo){
		return empService.delete(empNo);
	}

}
