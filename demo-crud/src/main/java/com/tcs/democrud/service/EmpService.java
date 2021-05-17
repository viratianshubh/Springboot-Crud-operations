package com.tcs.democrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.democrud.entity.Employee;
import com.tcs.democrud.repository.TcsRepository;

@Service
public class EmpService {
	
	@Autowired
	TcsRepository tcsRepository;

	public List<Employee> getAll() {
		return tcsRepository.getAll();
	}

	public String add(Employee emp) {
		return tcsRepository.add(emp);
	}

	public String edit(Employee emp) {
		return tcsRepository.edit(emp);
	}

	public String delete(int empNo) {
		return tcsRepository.delete(empNo);
	}
	

}
