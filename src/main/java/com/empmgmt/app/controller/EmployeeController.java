package com.empmgmt.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.empmgmt.app.domain.Employee;
import com.empmgmt.app.service.EmployeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeService employeService;
	
	@GetMapping("/all-employee")
	public ResponseEntity<Object> getEmployees(){
		List<Employee> employees = employeService.getAllEmployee();
		return ResponseEntity.status(HttpStatus.OK).body(employees);
	}
	
	@GetMapping("/work/{empId}")
	public ResponseEntity<Object> work(@PathVariable Integer empId){
		Employee emp = employeService.getWork(empId);
		return ResponseEntity.status(HttpStatus.OK).body(emp);
	}
	
	@GetMapping("/take-vacation/{empId}")
	public ResponseEntity<Object> takeVacation(@PathVariable Integer empId){
		String vacationDays = employeService.takeVacation(empId);
		return ResponseEntity.status(HttpStatus.OK).body(vacationDays);
	}
}
