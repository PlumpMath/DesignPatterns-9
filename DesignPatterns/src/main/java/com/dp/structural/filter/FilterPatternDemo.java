package com.dp.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Filter pattern or Criteria pattern is a design pattern that enables developers to filter a set of 
 * objects using different criteria and chaining them in a decoupled way through logical operations.
 * @author rahuldev
 *
 */
public class FilterPatternDemo {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));
		
		Criteria maleCriteria = new MaleCriteria();
		Criteria femaleCriteria = new FemaleCriteria();
		Criteria singleCriteria = new SingleCriteria();
		Criteria andCriteria = new AndCriteria(maleCriteria, singleCriteria);
		Criteria orCriteria = new OrCriteria(femaleCriteria, singleCriteria);
		
		System.out.println("Male : " + maleCriteria.meetCriteria(persons));
		System.out.println("Females : " + femaleCriteria.meetCriteria(persons));
		System.out.println("Single : " + singleCriteria.meetCriteria(persons));
		System.out.println("Male and Single : " + andCriteria.meetCriteria(persons));
		System.out.println("Female or Single : " + orCriteria.meetCriteria(persons));
	}
}
