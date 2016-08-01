package com.dp.creational.abstractfactory;

public class AFCTFactoryProducer {

	public static AFCTFactory getFactory(String type) {
		AFCTFactory afctFactory = null;
		switch (type) {
		case "shape":
			afctFactory = new AFCTShapeFactory();
			break;
		case "color":
			afctFactory = new AFCTColorFactory();
			break;
		default:
			break;
		}
		return afctFactory;
	}
}
