package com.backendexample.crudapp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.backendexample.crudapp.constants.Constants;
import com.backendexample.crudapp.dto.Employee;
import com.backendexample.crudapp.service.RequestService;

@Service
public class RequestServiceImpl implements RequestService {

	@Override
	public List<Employee> getEmployeeList() {
		return Constants.getUserList();
	}

	@Override
	public List<Employee> addNewEmployee(Employee e1) {
		
		Constants.getUserList().add(e1);
		return Constants.getUserList();
	}

}
