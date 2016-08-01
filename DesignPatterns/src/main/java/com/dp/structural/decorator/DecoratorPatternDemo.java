package com.dp.structural.decorator;

/**
 * Decorator pattern allows a user to add new functionality to an existing object without 
 * altering its structure.
 * This pattern creates a decorator class which wraps the original class and provides 
 * additional functionality keeping class methods signature intact.
 * @author rahuldev
 *
 */
public class DecoratorPatternDemo {

	public static void main(String[] args) {
		DCTShape shape = new DCTCircle();
		DCTShape redShapeDecorator = new RedShapeDecorator(shape);
		redShapeDecorator.draw();
		
		shape = new DCTSquare();
		redShapeDecorator = new RedShapeDecorator(shape);
		redShapeDecorator.draw();
	}
}
