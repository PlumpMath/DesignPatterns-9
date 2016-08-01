package com.dp.creational.prototype;

/**
 * Prototype pattern refers to creating duplicate object while keeping performance in mind.
 * This pattern is used when creation of object directly is costly. 
 * For example, an object is to be created after a costly database operation. We can cache the object, 
 * returns its clone on next request and update the database as and when needed thus reducing database calls.
 * @author rahuldev
 *
 */
public class PrototypeDemo {

	public static void main(String[] args) {
		PTShapeCache.loadShape();
		PTShape shape = PTShapeCache.getShape("circle");
		shape.draw();
		shape = PTShapeCache.getShape("square");
		shape.draw();
		shape = PTShapeCache.getShape("rectangle");
		shape.draw();
	}
}
