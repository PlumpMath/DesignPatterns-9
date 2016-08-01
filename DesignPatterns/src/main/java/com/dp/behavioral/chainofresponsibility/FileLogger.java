package com.dp.behavioral.chainofresponsibility;

public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		this.level = level;
	}
	
	@Override
	public void writeLogs(String message) {
		System.out.println("File logs : " + message);
	}
}
