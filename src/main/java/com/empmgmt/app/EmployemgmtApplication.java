package com.empmgmt.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.empmgmt.app.domain.Employee;

@SpringBootApplication
public class EmployemgmtApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(EmployemgmtApplication.class, args);
	}
	
	@Bean
	public List<Employee> loadData(){
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "John", "H", 110.0, 10.0));
		emp.add(new Employee(2, "Ravi", "M", 110.0, 20.0));
		emp.add(new Employee(3, "Peter", "S", 110.0, 10.0));
		emp.add(new Employee(4, "Rahesh", "H", 110.0, 10.0));
		emp.add(new Employee(5, "Mani", "M", 110.0, 20.0));
		emp.add(new Employee(6, "Sam", "S", 110.0, 05.0));
		emp.add(new Employee(7, "Rose", "H", 110.0, 10.0));
		emp.add(new Employee(8, "Jim", "M", 110.0, 25.0));
		emp.add(new Employee(9, "Aadhi", "S", 110.0, 10.0));
		emp.add(new Employee(10, "aravind", "H", 110.0, 5.0));
		return emp;
	}
	
}
