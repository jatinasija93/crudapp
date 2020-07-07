package com.backendexample.crudapp.constants;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.backendexample.crudapp.dto.Employee;
import com.backendexample.crudapp.dto.Location;

@Component
public class Constants{
	
	private static List<Employee> userList;
	
	@PostConstruct
	private void initializeData () {
		Location l1 = new Location("Haryana","Gurgaon","220,441");
		Location l2 = new Location("Haryana","Karnal","531,230");
		Location l3 = new Location("Haryana","Hisar","558,441");
		Location l4 = new Location("UP","Noida","220,441");
		Location l5 = new Location("USA","London","220,441");
		
		List<Location> list1 = new ArrayList<Location>();
		list1.add(l1);
		list1.add(l2);
		list1.add(l3);
		
		List<Location> list2 = new ArrayList<Location>();
		list2.add(l1);
		list2.add(l4);
		list2.add(l5);
		
		Employee e1 = new Employee("Diwakar", "Kumar", "Device Apps", list1);
		Employee e2 = new Employee("Jatin", "Asija", "HIS", list2);
		Employee e3 = new Employee("Dheeraj", "Sharma", "eCommerce", list1);
		
		userList = new ArrayList<Employee>();
		
		userList.add(e1);
		userList.add(e2);
		userList.add(e3);
		
	}

	public static List<Employee> getUserList() {
		return userList;
	}

	public static void setUserList(List<Employee> userList) {
		Constants.userList = userList;
	}
	
}