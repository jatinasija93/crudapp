package com.backendexample.crudapp.dto;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	
	private String firstName;
	private String lastName; 
	private String department;
	private List<Location> deployLocation;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Employee(String firstName, String lastName, String department, List<Location> deployLocation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.deployLocation = deployLocation;
	}
	public Employee() {
		super();
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public List<Location> getDeployLocation() {
		return deployLocation;
	}
	public void setDeployLocation(List<Location> deployLocation) {
		this.deployLocation = deployLocation;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department
				+ ", deployLocation=" + deployLocation + "]";
	} 
}
