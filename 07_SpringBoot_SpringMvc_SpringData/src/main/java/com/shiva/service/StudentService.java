package com.shiva.service;

import java.util.List;

import com.shiva.bindings.Student;

public interface StudentService {
public boolean saveStudent(Student st);
public List<Student> getAllStudents();

public Student getEmpById(int id);

public boolean updateStudent(Student st);

public void deleteStudent(int id);
}
