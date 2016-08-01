package com.dp.structural.facade;

public class ShapeMaker {

	private FCDShape circle;
	private FCDShape square;
	private FCDShape rectangle;
	
	public ShapeMaker() {
		this.circle = new FCDCircle();
		this.square = new FCDSquare();
		this.rectangle = new FCDRectangle();
	}
	
	public void drawCircle() {
		this.circle.draw();
	}
	
	public void drawSquare() {
		this.square.draw();
	}
	
	public void drawRectangle() {
		this.rectangle.draw();
	}
	
	public FCDShape getCircle() {
		return circle;
	}

	public void setCircle(FCDShape circle) {
		this.circle = circle;
	}

	public FCDShape getSquare() {
		return square;
	}

	public void setSquare(FCDShape square) {
		this.square = square;
	}

	public FCDShape getRectangle() {
		return rectangle;
	}

	public void setRectangle(FCDShape rectangle) {
		this.rectangle = rectangle;
	}
}
