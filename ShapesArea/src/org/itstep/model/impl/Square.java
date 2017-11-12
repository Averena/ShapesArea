package org.itstep.model.impl;

import org.itstep.model.Shape;

public class Square implements Shape{
	
	private int side;
	private String name;
	
	@Override//
	public void printArea() {
		System.out.println("Area of the "+ name +" is " + Math.pow(side, 2) + " sq.m."); 
		
	}
	
	public void setSquare(int side, String name) {
		this.side = side;
		this.name = name;
		
	}

}
