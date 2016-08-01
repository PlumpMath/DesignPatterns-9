package com.dp.behavioral.chainofresponsibility;

public abstract class AbstractLogger {

	public static final int DEBUG = 1;
	public static final int INFO = 2;
	public static final int ERROR = 3;
	
	protected int level;
	protected AbstractLogger nextLogger;
	
	public abstract void writeLogs(String message);
	
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	public void log(String message, int level) {
		if (this.level <= level) {
			writeLogs(message);
		}
		if (this.nextLogger != null) {
			this.nextLogger.log(message, level);
		}
	}
}
