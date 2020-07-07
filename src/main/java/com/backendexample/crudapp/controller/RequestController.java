package com.backendexample.crudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.backendexample.crudapp.dto.Employee;

@Component
public interface RequestController {

	
	public List<Employee> getEmployeeList();
	public List<Employee> addNewEmployee( Employee e1, HttpServletRequest request,HttpServletResponse response);
	
}
