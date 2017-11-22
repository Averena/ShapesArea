package org.itstep.model.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.itstep.model.Shape;

public class Triangle implements Shape{
	
	private static Logger logger = Logger.getLogger(Triangle.class.getName());
	private double P,Square;
	
	@Override//
	public void printArea() {
		logger.log(Level.INFO,"Area of the triangle is "+ String.valueOf(this.Square/10000) +" sq.m.");
		
		
		//System.out.println("Area of the triangle is "+ this.Square/10000 +" sq.m.");  //переводим см. в кв. м
	
	}
	public String getArea() {
		return String.valueOf(this.Square/10000);
	}
	//функция принимает 3 стороны треугольника для подсчетов
	
	public void setSides(int sideA, int sideB, int sideC) {
		this.P = (sideA +sideB +sideC)/2;
		this.Square = Math.sqrt(this.P*(this.P -sideA)*(this.P -sideB)*(this.P -sideC));	
	}

}
