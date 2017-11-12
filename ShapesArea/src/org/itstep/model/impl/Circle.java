package org.itstep.model.impl;

import org.itstep.model.Shape;

public class Circle implements Shape{

	private int radius;
	private String name;
	
	@Override// аннотация
	public void printArea() {
		System.out.println("Area of the "+ name+" is " + Math.PI*radius*radius + " sq.m.");
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius,String name) {
		this.radius = radius;
		this.name = name;
	}

	

}