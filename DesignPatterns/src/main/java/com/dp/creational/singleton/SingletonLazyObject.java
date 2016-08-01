package com.dp.creational.singleton;

public class SingletonLazyObject {

	private static volatile SingletonLazyObject object;
	
	private SingletonLazyObject(){};
	
	public static SingletonLazyObject getInstance() {
		if (object == null) {
			synchronized (SingletonLazyObject.class) {
				if (object == null) {
					object = new SingletonLazyObject();
				}
			}
		}
		return object;
	}
	
	public void show(){
		System.out.println("Singleton Object function call.");
	}
}
