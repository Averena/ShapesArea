package org.itstep.model.impl;

import org.itstep.model.Shape;

public class Circle implements Shape{

	private int radius;
	
	@Override// аннотация
	public void printArea() {
		System.out.println("Aria of this circle is " + Math.PI*radius*radius + " sq.m.");
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	

}