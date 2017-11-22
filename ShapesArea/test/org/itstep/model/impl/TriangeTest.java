package org.itstep.model.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangeTest {

	@Test
	public void testPrintArea() {
		Triangle triangle = new Triangle();
		triangle.setSides(50, 40, 30);
		triangle.printArea();
		String testArea = triangle.getArea();
		assertEquals("0.06", testArea);
	}

}
//0.06