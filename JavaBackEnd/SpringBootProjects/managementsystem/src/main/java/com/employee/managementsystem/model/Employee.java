package com.employee.managementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")
public class Employee {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "emp_id" , nullable = true)
	private String empId; 
	
	@Column(name = "emp_name")
	private String empName;

	@Column(name = "emp_salary")
	private int salary;

	@Column(name = "emp_age")
	private int age;

	@Column(name = "emp_aadhar_no")
	private int aadharNumber;

	@Column(name = "department")
	private String department;

	
}
