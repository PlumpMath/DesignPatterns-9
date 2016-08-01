package com.dp.structural.facade;

/**
 * Facade pattern hides the complexities of the system and provides an interface to the client using 
 * which the client can access the system.
 * 
 * This pattern involves a single class which provides simplified methods required by client and 
 * delegates calls to methods of existing system classes.
 * 
 * @author rahuldev
 *
 */
public class FacadePatternDemo {

	public static void main(String[] args) {
		ShapeMaker maker = new ShapeMaker();
		maker.drawCircle();
		maker.drawRectangle();
		maker.drawSquare();
	}

}
