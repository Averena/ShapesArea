package org.itstep.model.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void testPrintArea() {
		Square square = new Square();
		square.setSquare(158, "square");
		square.printArea();
		String testArea = square.getArea();
		assertEquals("24964.0", testArea);
	}

}
