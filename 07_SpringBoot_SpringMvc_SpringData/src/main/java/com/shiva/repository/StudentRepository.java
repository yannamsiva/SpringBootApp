package com.shiva.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiva.Entity.StudentEntity;



public interface StudentRepository extends JpaRepository<StudentEntity,Serializable> {

}
