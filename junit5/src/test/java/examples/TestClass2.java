package examples;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestClass2 {

	@Test
	@DisplayName("SanityTest")
	public void test4() {
		System.out.println("Inside test4");
	}
	
	@Test
	@DisplayName("SmokeTest")
	public void test5() {
		System.out.println("Inside test5");
	}
	
	@Test
	@DisplayName("MonkeyTest")
	public void test6() {
		System.out.println("Inside test6");
	}
}
