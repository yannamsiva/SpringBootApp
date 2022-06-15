package com.shiva.service;

import java.util.List;

import com.shiva.binding.Employee;

public interface EmployeeService {

		public boolean saveEmployee(Employee st);
		
		public List<Employee> getAllEmployees();

		/*
		 * public Employee getEmpById(int id);
		 * 
		 * public boolean updateEmployee(Employee st);
		 * 
		 * public void deleteEmployee(int id);
		 */
		}
