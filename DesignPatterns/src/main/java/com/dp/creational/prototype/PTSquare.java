package com.dp.creational.prototype;

public class PTSquare extends PTShape {
	
	public PTSquare(int id, String type) {
		super(id, type);
	}

	@Override
	public void draw() {
		System.out.println("Drawing square");
	}
}
