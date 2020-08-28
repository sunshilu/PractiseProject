package system;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test01AutoTest {

	@Test
	public void testAdd() {
		assertEquals(8,new Test01().add(3,5));
	}

	@Test
	public void testSubstract() {
		assertEquals(0,new Test01().divide(3,5));
	}

	@Test
	public void testMultiply() {
		assertEquals(-2,new Test01().substract(3,5));
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

}
