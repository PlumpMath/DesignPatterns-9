package com.dp.behavioral.chainofresponsibility;

/**
 * As the name suggests, the chain of responsibility pattern creates a chain of receiver objects 
 * for a request. This pattern decouples sender and receiver of a request based on type of request.
 * 
 * In this pattern, normally each receiver contains reference to another receiver. 
 * If one object cannot handle the request then it passes the same to the next receiver and so on.
 * 
 * @author rahuldev
 *
 */
public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		AbstractLogger consoleLogger = new ConsoleLogger(1);
		AbstractLogger fileLogger = new FileLogger(3);
		consoleLogger.setNextLogger(fileLogger);
		
		consoleLogger.log("Log first message", AbstractLogger.INFO);
		consoleLogger.log("Log second message", AbstractLogger.DEBUG);
		consoleLogger.log("Log third message", AbstractLogger.ERROR);
	}
}
