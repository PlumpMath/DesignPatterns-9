package com.dp.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PTShapeCache {

	public static Map<String, PTShape> map = new HashMap<>();
	
	public static PTShape getShape(String type) {
		return (PTShape) map.get(type).clone();
	}
	
	public static void loadShape() {
		PTShape shape = new PTCircle(1, "circle");
		map.put("circle", shape);
		shape = new PTSquare(2, "square");
		map.put("square", shape);
		shape = new PTRectangle(1, "rectangle");
		map.put("rectangle", shape);
		System.out.println(map);
	}
}
