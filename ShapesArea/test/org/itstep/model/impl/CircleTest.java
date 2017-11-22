package org.itstep.model.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testPrintArea() {
		Circle circle  = new Circle();
		circle.setRadius(10, "круг");
		circle.printArea();
		String testArea = circle.getArea();
		assertEquals ("314.1592653589793", testArea);
	}

}
