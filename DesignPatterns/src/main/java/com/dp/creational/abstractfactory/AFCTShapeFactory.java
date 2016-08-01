package com.dp.creational.abstractfactory;

public class AFCTShapeFactory extends AFCTFactory {

	public AFCTShape getShape(String type) {
		AFCTShape shape = null;
		switch (type) {
		case "square":
			shape = new AFCTSquare();
			break;
		case "circle":
			shape = new AFCTCircle();
			break;
		case "rectangle":
			shape = new AFCTRectangle();
			break;
		default:
			break;
		}
		return shape;
	}
	
	public AFCTColor getColor(String color) {
		AFCTColor color2 = null;
		return color2;
	}
}
