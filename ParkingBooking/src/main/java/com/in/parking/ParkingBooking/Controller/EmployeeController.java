package com.in.parking.ParkingBooking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.parking.ParkingBooking.Service.EmployeeServiceImpl;
import com.in.parking.ParkingBooking.pojoclass.Employee;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
	@Autowired
	private  EmployeeServiceImpl employeeservice;
	
	@GetMapping("/getall")
	public List<Employee> getAllEmployee(){
		
		return employeeservice.getallEmployee();
		
	}
	
	@PostMapping("/save")
	public Employee EmployeeSave(@RequestBody Employee employee) {
		
		return employeeservice.SaveEmployee(employee);	
		
	}
	
	@PutMapping("/upadte")
	public Employee EmployeeUpdate(@RequestBody Employee employee) {
		
		return employeeservice.UpdateEmployee(employee);
		
	}
	@DeleteMapping("/delete")
	public void DeleteEmployee(@PathVariable int id) {
		
		employeeservice.DeleteEmployee(id);
	}

}
