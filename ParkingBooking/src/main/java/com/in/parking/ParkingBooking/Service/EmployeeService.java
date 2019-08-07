package com.in.parking.ParkingBooking.Service;

import java.util.List;

import com.in.parking.ParkingBooking.pojoclass.Employee;


public interface EmployeeService {
	
	
	List<Employee> getallEmployee();
	Employee SaveEmployee(Employee employee);
	Employee UpdateEmployee(Employee employee);
	void DeleteEmployee(long id);
	

}
