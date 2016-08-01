package com.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Employee {

	private int id;
	private String name;
	private String designation;
	private long salary;
	
	public Employee(int id, String name, String designation, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.subordinates = new ArrayList<>();
	}
	
	public void addSubordinate(Employee employee) {
		this.subordinates.add(employee);
	}
	
	public void removeSubordinate(Employee employee) {
		this.subordinates.remove(employee);
	}
	
	private List<Employee> subordinates;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(List<Employee> subordinates) {
		this.subordinates = subordinates;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
