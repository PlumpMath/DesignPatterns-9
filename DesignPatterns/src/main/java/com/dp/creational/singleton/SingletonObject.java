package com.dp.creational.singleton;

public class SingletonObject {

	private static SingletonObject object = new SingletonObject();
	
	private SingletonObject(){};
	
	public static SingletonObject getInstance() {
		return object;
	}
	
	public void show(){
		System.out.println("Singleton Object function call.");
	}
}
