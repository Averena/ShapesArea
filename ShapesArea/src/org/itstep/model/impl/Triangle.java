package org.itstep.model.impl;

import org.itstep.model.Shape;

public class Triangle implements Shape{

	private double P,Square;
	
	@Override//
	public void printArea() {
		System.out.println("Area of the triangle is "+ this.Square/10000 +" sq.m.");  //переводим см. в кв. м
	
	}
	//функция принимает 3 стороны треугольника для подсчетов
	
	public void setSides(int sideA, int sideB, int sideC) {
		this.P = (sideA +sideB +sideC)/2;
		this.Square = Math.sqrt(this.P*(this.P -sideA)*(this.P -sideB)*(this.P -sideC));	
	}

}
