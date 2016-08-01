package com.dp.creational.factory;

public class FCTShapeFactory {

	public static FCTShape getShape(String type) {
		FCTShape shape = null;
		switch (type) {
		case "square":
			shape = new FCTSquare();
			break;
		case "circle":
			shape = new FCTCircle();
			break;
		case "rectangle":
			shape = new FCTRectangle();
			break;
		default:
			break;
		}
		return shape;
	}
}
