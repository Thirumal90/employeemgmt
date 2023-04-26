package com.empmgmt.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.empmgmt.app.domain.Employee;

@Component
public class EmployeService {
	
	@Autowired
	List<Employee> empList;
	
	public List<Employee> getAllEmployee() {
		return empList;
	}
	
	public Employee getWork(Integer empId) {
		Employee employee = empList.stream().filter(x -> x.getEmpId() == empId).findFirst()
                .orElse(null);
		return employee;
	}

	public String takeVacation(Integer empId) {
		Double vacationDays = 0.0;
		Employee employee = empList.stream().filter(x -> x.getEmpId() == empId).findFirst()
                .orElse(null);
		
		if(employee.getEmpType().equals("H")) {
			vacationDays = 10 - employee.getVacations(); 
		} else if(employee.getEmpType().equals("M")) {
			vacationDays = 30 - employee.getVacations();
		} else if(employee.getEmpType().equals("S")) {
			vacationDays = 15 - employee.getVacations();
		}
		
	return "Vacation Taken : "+vacationDays;
}
	
}
