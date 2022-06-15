package com.shiva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shiva.binding.Employee;
import com.shiva.service.impl.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	public EmployeeServiceImpl empService;
	
	@RequestMapping("/loadForm")
	public String loadForm(Model model)
	{
		
		Employee emp=new Employee();
		
		model.addAttribute("emp", emp);
		
		return "employee";
	}
	
	@RequestMapping(value  = "/empInsert",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("emp")     Employee emp,Model model)
	
	{
		boolean saveEmployee = empService.saveEmployee(emp);
		
		String msg="";
		
if(saveEmployee)
{
	msg="Employee Record Inserted Successfully";
}
else
	msg="Employee Record Not Inserted Successfully";

		model.addAttribute("msg", msg);
		
		return "employee";
	}
	
	
	
	@RequestMapping("/viewEmployees")
	public String viewAllEmployees(Model model) {
		 List<Employee> allEmployees = empService.getAllEmployees();
		model.addAttribute("employees", allEmployees);
		return "viewemployee";
	}
	
	
	
	
	
	
	
	
	
	
	
}
