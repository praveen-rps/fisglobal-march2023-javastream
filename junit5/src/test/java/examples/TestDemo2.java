package examples;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestDemo2 {

	@BeforeEach
	void test1() {
		System.out.println("Before method is called");
	}
	
	@AfterEach
	void test4() {
		System.out.println("after method is called");
	}
	
	@BeforeAll
	public static void test6() {
		System.out.println("beforeclass method is called...");
	}
	
	@AfterAll
	public static void test7() {
		System.out.println("afterclass  method is called...");
	}
	
	@Test
	@DisplayName("SanityTet")
	void test2() {
		System.out.println("Test2 method is called..");
	}
	
	@Test
	void test3() {
		System.out.println("Test3 method is called..");
	}


}
