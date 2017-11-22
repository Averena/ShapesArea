package org.itstep.model.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.itstep.model.Shape;

public class Square implements Shape{
	
	
	private static Logger logger = Logger.getLogger(Square.class.getName());
	private int side;
	private String name;
	
	@Override//
	public void printArea() {
		logger.log(Level.INFO,"Area of the "+ name +" is " + String.valueOf(Math.pow(side, 2)) + " sq.m.");
	}
		// System.out.println("Area of the "+ name +" is " + Math.pow(side, 2) + " sq.m."); 
		
		public String getArea() {
			return String.valueOf(Math.pow(side, 2));
	}
	
	public void setSquare(int side, String name) {
		this.side = side;
		this.name = name;
		
	}

}
