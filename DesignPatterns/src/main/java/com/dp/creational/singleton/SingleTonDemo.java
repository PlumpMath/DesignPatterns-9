package com.dp.creational.singleton;

/**
 * This pattern involves a single class which is responsible to create an object while making 
 * sure that only single object gets created. This class provides a way to access its only object
 *  which can be accessed directly without need to instantiate the object of the class.
 * @author rahuldev
 *
 */
public class SingleTonDemo {

	public static void main(String[] args) {
		// Eager
		SingletonObject object = SingletonObject.getInstance();
		object.show();
		System.out.println(object);
		SingletonObject object2 = SingletonObject.getInstance();
		System.out.println(object2);
		System.out.println(object == object2);
		
		// Lazy
		SingletonLazyObject lazyObject = SingletonLazyObject.getInstance();
		object.show();
		System.out.println(lazyObject);
		SingletonLazyObject lazyObject2 = SingletonLazyObject.getInstance();
		System.out.println(lazyObject);
		System.out.println(lazyObject == lazyObject2);
	}

}
