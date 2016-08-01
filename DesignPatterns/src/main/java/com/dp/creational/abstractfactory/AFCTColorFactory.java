package com.dp.creational.abstractfactory;

public class AFCTColorFactory extends AFCTFactory {

	public AFCTShape getShape(String type) {
		AFCTShape shape = null;
		return shape;
	}
	
	public AFCTColor getColor(String color) {
		AFCTColor color2 = null;
		switch (color) {
		case "red":
			color2 = new AFCTRed();
			break;
		case "green":
			color2 = new AFCTGreen();
			break;
		case "blue":
			color2 = new AFCTBlue();
			break;
		default:
			break;
		}
		return color2;
	}
}
