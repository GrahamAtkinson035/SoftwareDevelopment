package Homework5tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Homework5.interfaceExampleImplementation;

public class InterafceTests {

	@Test
	public void testinterface() {
		interfaceExampleImplementation ex = new interfaceExampleImplementation();
		assertEquals(24, ex.sum());
		assertEquals(8, ex.average());
	}

}
