package com.tcs.democrud.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tcs.democrud.entity.Employee;

@Repository
public class TcsRepository {
	
	public List<Employee> employee = new ArrayList<Employee>();

	public List<Employee> getAll() {
		return employee;
	}

	public String add(Employee emp) {
		employee.add(emp);
		return "Record Added Successfully";
	}

	public String edit(Employee emp) {
		employee.stream().filter(e -> e.getEmployeeId() == emp.getEmployeeId()).forEach(e -> {
			e.setAddress(emp.getAddress());
			e.setName(emp.getName());
		});
		return "Record Updated Successfully";
	}

	public String delete(int empNo) {
		employee.remove(empNo-1);
		return "Record Deleted";
	}

}
