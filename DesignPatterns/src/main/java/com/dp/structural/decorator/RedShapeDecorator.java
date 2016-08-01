package com.dp.structural.decorator;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(DCTShape shape) {
		super(shape);
	}

	@Override
	public void draw() {
		super.getShape().draw();
		setRedBorder();
	}
	
	private void setRedBorder() {
		System.out.println("Setting red border.");
	}

}
