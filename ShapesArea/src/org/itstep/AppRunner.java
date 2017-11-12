package org.itstep;

import java.awt.Shape;

import org.itstep.model.impl.Circle;
import org.itstep.model.impl.Square;
import org.itstep.model.impl.Triangle;

public class AppRunner {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.setRadius(20,"circle1");
		circle1.printArea();

		Circle circle2 = new Circle();
		circle2.setRadius(15,"circle2");
		circle2.printArea();
		
		System.out.println("________________");
		
	    Square square1 = new Square();
	    square1.setSquare(10,"square1");
	    square1.printArea();
	    
	    Square square2 = new Square();
	    square2.setSquare(30,"square2");
	    square2.printArea();
	    
	    System.out.println("________________");
	    
	    Triangle triangle1 = new Triangle();
	    triangle1.setSides(30,40,50);
	    triangle1.printArea();
	    
	    System.out.println("________________");
	}

	
}
