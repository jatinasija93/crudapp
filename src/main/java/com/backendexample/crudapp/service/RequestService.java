package com.backendexample.crudapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.backendexample.crudapp.dto.Employee;

@Service
public interface RequestService {

	public List<Employee> getEmployeeList();
	public List<Employee> addNewEmployee(Employee e1);
}
