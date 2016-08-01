package com.dp.structural.flyweight;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class FLWCircle implements FLWShape {

	private int radius;
	private int x;
	private int y;
	private String color;
	
	public FLWCircle(String color) {
		this.color = color;
	}
	
	public void draw() {
		System.out.println("Drawing Circle : " + ToStringBuilder.reflectionToString(this));
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
