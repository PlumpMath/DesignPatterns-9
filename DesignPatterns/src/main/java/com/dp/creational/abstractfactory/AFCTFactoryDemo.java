package com.dp.creational.abstractfactory;

/**
 * 
 * @author rahuldev
 * 
 * Abstract Factory patterns work around a super-factory which creates other factories. 
 * This factory is also called as factory of factories.
 * In Abstract Factory pattern an interface is responsible for creating a factory of related
 * objects without explicitly specifying their classes. 
 * Each generated factory can give the objects as per the Factory pattern.
 */
public class AFCTFactoryDemo {

	public static void main(String[] args) {
		AFCTFactory afctFactory = AFCTFactoryProducer.getFactory("shape");
		AFCTShape shape = afctFactory.getShape("square");
		shape.draw();
		shape = afctFactory.getShape("rectangle");
		shape.draw();
		shape = afctFactory.getShape("circle");
		shape.draw();
		
		afctFactory = AFCTFactoryProducer.getFactory("color");
		AFCTColor color = afctFactory.getColor("red");
		color.fill();
		color = afctFactory.getColor("blue");
		color.fill();
		color = afctFactory.getColor("green");
		color.fill();
	}

}
