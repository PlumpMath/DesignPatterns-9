package com.dp.structural.proxy;

public class RealImage implements Image {

	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		this.loadFromDisk();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		System.out.println("Displaying Image : " + this.fileName);
	}
	
	private void loadFromDisk() {
		System.out.println("Loading from disk : " + this.fileName);
	}
}
