package com.shiva.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiva.Entity.StudentEntity;
import com.shiva.bindings.Student;
import com.shiva.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository stuRepo;
	@Override
	public boolean saveStudent(Student st) {
		// TODO Auto-generated method stub
		// we got data in binding class object
		//to save we should call repo.save(T entity)which expect entity Object with data
		//copy data from binding object to entity Object
		StudentEntity entity= new StudentEntity();
		BeanUtils.copyProperties(st,entity);
		StudentEntity savedEntity=stuRepo.save(entity);

		return savedEntity.getSno()!= 0;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();

		List<StudentEntity> entityList = stuRepo.findAll();
		
		entityList.forEach(entity ->{
			Student b = new Student();
			//BeanUtils.copyProperties(entity, b);

b.setSno(entity.getSno());
b.setSname(entity.getSname());
b.setSaddd(entity.getSaddd());
students.add(b);
		});
		
		return students;
	}

	@Override
	public Student getEmpById(int id) {
		// TODO Auto-generated method stub
		Student sb=null;
		Optional<StudentEntity>findById=stuRepo.findById(id);
		  if(findById.isPresent()) { 
			  StudentEntity entity=findById.get();
			  sb=new Student();
		 sb.setSno(entity.getSno());
		 sb.setSname(entity.getSname());
		 sb.setSaddd(entity.getSaddd());
		  } 
		  
		 
		return sb;
	}

	@Override
	public boolean updateStudent(Student st) {
		// TODO Auto-generated method stub
		StudentEntity entity= new StudentEntity();
		System.out.println(st.getSno()+"\t"+st.getSname()+"\t"+st.getSaddd());
	
		BeanUtils.copyProperties(st,entity);
		System.out.println(entity.getSno()+"\t"+entity.getSname()+"\t"+entity.getSaddd());
		StudentEntity savedEntity=stuRepo.save(entity);
	
		//StudentEntity savedEntity=stuRepo.save(entity);
		
		//stuRepo.
		boolean flag=false;
		if(savedEntity.getSno()!= 0)
			flag=true;
		
		return flag;
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		Student sb=null;
		
stuRepo.deleteById(id);
		  
		 

	}

}
