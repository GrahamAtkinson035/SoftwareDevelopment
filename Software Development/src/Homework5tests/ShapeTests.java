package Homework5tests;

import static org.junit.Assert.*;
import Homework5.*;

import org.junit.Test;

import Homework5.Square;

public class ShapeTests {

	@Test
	public void squareTest() {
		Square sq = new Square(2);
		assertEquals(4,sq.getArea(),0);
		assertEquals(true, sq.isPolygon());
	}
	
	@Test
	public void circleTest() {
		Circle c = new Circle(2);
		assertEquals(12.5,c.getArea(),.1);
		assertEquals(false, c.isPolygon());
	}
	

}
