package examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import sourcecode.Maths;

class TestDemo {

	@Test
	void test() {
		assertEquals(50,Maths.add(20, 30));
	}
	
	@Test
	void whenFirtValueIsBigger() {
		assertEquals(10,Maths.biggest(10,2, 3));
	}
	
	@Test
	void whenSecondValueIsBigger() {
		assertEquals(200,Maths.biggest(100,200, 30));
	}
	
	@Test
	void whenThirdValueIsBigger() {
		assertEquals(3000,Maths.biggest(100,200, 3000));
	}


}
