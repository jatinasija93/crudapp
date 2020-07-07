package com.backendexample.crudapp.controller.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backendexample.crudapp.controller.RequestController;
import com.backendexample.crudapp.dto.Employee;
import com.backendexample.crudapp.service.RequestService;

@RestController
public class RequestControllerImpl implements RequestController {
	
	
	@Autowired
	RequestService requestService;

	
	@GetMapping("/getEmployeeList")
	@Override
	public List<Employee> getEmployeeList() {
		return requestService.getEmployeeList();
	}
	
	@PostMapping("/addNewEmployee")
	@Override
	public List<Employee> addNewEmployee(@RequestBody Employee e1,HttpServletRequest request,HttpServletResponse response) {
		System.out.println("employee to be added, "+e1);
		return requestService.addNewEmployee(e1);
	}

}
