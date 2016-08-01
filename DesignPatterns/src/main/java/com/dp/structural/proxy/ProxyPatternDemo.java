package com.dp.structural.proxy;

/**
 * In proxy pattern, a class represents functionality of another class.
 * In proxy pattern, we create object having original object to interface its functionality to outer world.
 * @author rahuldev
 *
 */
public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image proxyImage = new ProxyImage("test.jpg");
		proxyImage.display();
		proxyImage.display();
	}
}
