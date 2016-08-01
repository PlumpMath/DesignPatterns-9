package com.dp.structural.decorator;

public abstract class ShapeDecorator implements DCTShape {

	private DCTShape shape;
	
	public ShapeDecorator(DCTShape shape) {
		super();
		this.setShape(shape);
	}

	public DCTShape getShape() {
		return shape;
	}

	public void setShape(DCTShape shape) {
		this.shape = shape;
	}

}
