package com.shiva.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
//entity class mapped with db table
@Data
@Entity
@Table(name = "EMPLOYEE")
public class EmployeeEntity {

	@Id
	@Column(name = "ENO")
	@GenericGenerator(name = "myGenerator",strategy = "increment")
	@GeneratedValue(generator = "myGenerator" ,strategy = GenerationType.AUTO)
	private int eno;
	@Column(name = "ENAME")
	private String ename;
	@Column(name = "EADD")
	private String eadd;
	
	
	
}
