package com.dp.structural.flyweight;

/**
 * Flyweight pattern is primarily used to reduce the number of objects created and to decrease 
 * memory footprint and increase performance. 
 * This type of design pattern comes under structural pattern as this pattern provides ways to 
 * decrease object count thus improving the object structure of application.
 * 
 * Flyweight pattern tries to reuse already existing similar kind objects by storing them and 
 * creates new object when no matching object is found. 
 * 
 * @author rahuldev
 *
 */
public class FlyWeightPatternDemo {

	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
	
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			FLWCircle circle = new FLWCircle(getRandomColor());
			circle.setRadius(100);
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.draw();
		}
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}
