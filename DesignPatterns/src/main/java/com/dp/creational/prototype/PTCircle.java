package com.dp.creational.prototype;

public class PTCircle extends PTShape {

	public PTCircle(int id, String type) {
		super(id, type);
	}

	@Override
	public void draw() {
		System.out.println("Drawing circle");
	}
}
