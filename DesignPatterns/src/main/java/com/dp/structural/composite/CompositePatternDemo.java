package com.dp.structural.composite;

/**
 * Composite pattern is used where we need to treat a group of objects in similar way as a single object. 
 * Composite pattern composes objects in term of a tree structure to represent part as well as whole 
 * hierarchy.
 * 
 * This pattern creates a class that contains group of its own objects. 
 * This class provides ways to modify its group of same objects.
 * @author rahuldev
 *
 */
public class CompositePatternDemo {

	public static void main(String[] args) {
		Employee ceo = new Employee(1, "John", "CEO", 30000);

		Employee headSales = new Employee(2, "Robert", "Head Sales", 20000);
		Employee headMarketing = new Employee(3, "Michel", "Head Marketing", 20000);

		Employee clerk1 = new Employee(4, "Laura", "Marketing", 10000);
		Employee clerk2 = new Employee(5, "Bob", "Marketing", 10000);

		Employee salesExecutive1 = new Employee(6, "Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee(7, "Rob", "Sales", 10000);
		
		ceo.addSubordinate(headSales);
		ceo.addSubordinate(headMarketing);
		
		headSales.addSubordinate(salesExecutive1);
		headSales.addSubordinate(salesExecutive2);
		
		headMarketing.addSubordinate(clerk1);
		headMarketing.addSubordinate(clerk2);
		
		System.out.println(ceo);
	}
}
