package com.dp.behavioral.chainofresponsibility;

public class ConsoleLogger extends AbstractLogger {
	
	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	public void writeLogs(String message) {
		System.out.println("Console logs : " + message);
	}
}
