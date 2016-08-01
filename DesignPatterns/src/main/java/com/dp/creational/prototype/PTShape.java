package com.dp.creational.prototype;

public abstract class PTShape implements Cloneable {

	private int id;
	private String type;
	
	public abstract void draw();
	
	public PTShape(int id, String type) {
		this.id = id;
		this.type = type;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	protected Object clone() {
		Object object = null;
		try {
			object =  super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return object;
	}
}
