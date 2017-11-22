package org.itstep.model.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.itstep.model.Shape;

public class Circle implements Shape{

	private static Logger logger = Logger.getLogger(Circle.class.getName());
	private int radius;
	private String name;
	
	@Override// аннотация
	public void printArea() {
		logger.log(Level.INFO, "Area of the "+ name+" is " + Math.PI*radius*radius + " sq.m.");
		
//		System.out.println("Area of the "+ name+" is " + Math.PI*radius*radius + " sq.m.");
	}

	public String getArea() {
		return String.valueOf(Math.PI*radius*radius);
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius,String name) {
		this.radius = radius;
		this.name = name;
	}

	

}