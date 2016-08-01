package com.dp.creational.abstractfactory;

public abstract class AFCTFactory {

	public abstract AFCTShape getShape(String type);
	
	public abstract AFCTColor getColor(String color);
}
