package com.dp.creational.factory;

/**
 * 
 * @author Rahul
 *
 * This type of design pattern comes under creational pattern as this pattern provides one of the best 
 * ways to create an object.In Factory pattern, we create object without exposing the creation logic 
 * to the client and refer to newly created object using a common interface.
 */
public class FCTFactoryDemo {

	public static void main(String[] args) {
		FCTShape shape = FCTShapeFactory.getShape("square");
		shape.draw();
		shape = FCTShapeFactory.getShape("rectangle");
		shape.draw();
		shape = FCTShapeFactory.getShape("circle");
		shape.draw();
	}

}
