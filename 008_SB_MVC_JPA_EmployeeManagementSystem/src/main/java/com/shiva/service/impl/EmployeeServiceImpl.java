package com.shiva.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiva.binding.Employee;
import com.shiva.entity.EmployeeEntity;
import com.shiva.repo.EmployeeRepository;
import com.shiva.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeRepository empRepo;
	
	
	@Override
	public boolean saveEmployee(Employee st) {
		// TODO Auto-generated method stub
		
		boolean flag=false;
		EmployeeEntity entity=new EmployeeEntity();
		
		BeanUtils.copyProperties(st, entity);
		/*
		 * entity.setEname(st.getEname()); entity.setEadd(st.getEadd());
		 */
		
		EmployeeEntity emp = empRepo.save(entity);
		
		if(emp!=null)
		{
			flag=true;
		}
			
		
		
		return flag;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<EmployeeEntity> entityRecords = empRepo.findAll();
		
		List<Employee>addRecords=new ArrayList<>();
		
		for(EmployeeEntity entity: entityRecords)
		{
			Employee e=new Employee();
			BeanUtils.copyProperties(entity, e);
			
			addRecords.add(e);
			
		}
		
		
		
		
		return addRecords;
	}

}
