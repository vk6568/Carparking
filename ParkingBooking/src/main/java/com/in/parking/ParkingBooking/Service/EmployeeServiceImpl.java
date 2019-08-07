package com.in.parking.ParkingBooking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.parking.ParkingBooking.Dao.EmployeeRepository;
import com.in.parking.ParkingBooking.pojoclass.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeerepository;

	@Override
	public List<Employee> getallEmployee() {
		// TODO Auto-generated method stub
		return employeerepository.findAll();
	}

	@Override
	public Employee SaveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return   employeerepository.save(employee);
	}

	@Override
	public Employee UpdateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeerepository.saveAndFlush(employee);
	}

	@Override
	public void DeleteEmployee(long id) {
				// TODO Auto-generated method stub
		employeerepository.deleteById(id);
		
	}
	
    

}
