package com.dp.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FLWShapeFactory {

	private static Map<String, FLWShape> shapeMap = new HashMap<>(); 
	
	public static FLWShape getShape(String color) {
		FLWShape shape = shapeMap.get(color);
		
		if (shape == null) {
			shape = new FLWCircle(color);
			shapeMap.put(color, shape);
		}
		return shape;
	}
}
