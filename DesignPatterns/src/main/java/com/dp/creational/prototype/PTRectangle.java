package com.dp.creational.prototype;

public class PTRectangle extends PTShape {

	public PTRectangle(int id, String type) {
		super(id, type);
	}

	@Override
	public void draw() {
		System.out.println("Drawing rectangle");
	}
}
