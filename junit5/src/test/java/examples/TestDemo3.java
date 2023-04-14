package examples;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
 * @Test
 * public void test1(){
 * 	assertEquals(str1,"abc");
 * }
 * 
 */
class TestDemo3 {

	@Test
	void testAssertAll() {
		 String str1 = "abc";
		 String str2 = "pqr";
		 String str3 = "xyz";
		 assertAll("numbers",
		      () -> assertEquals(str1,"abc"),
			  () -> assertEquals(str2,"pqr"),
			  () -> assertEquals(str3,"xyz")
		 );
		 //uncomment below code and understand each assert execution
	     assertAll("numbers",
			  () -> assertEquals(str1,"abc"),
			  () -> assertEquals(str2,"pqr"),
			  () -> assertEquals(str3,"xyz")
		 );
	}
	/*
	@Test
	void exceptionTesting() {
	    MyException thrown = assertThrows(
	           MyException.class,
	           () -> myObject.doThing(),
	           "Expected doThing() to throw, but it didn't"
	    );

	    assertTrue(thrown.getMessage().contentEquals("Stuff"));
	}
	*/
	
	@Test
	void testExpectedException() {

		NumberFormatException thrown = 
				Assertions.assertThrows(NumberFormatException.class, 
				() -> {	Integer.parseInt("One");}, 
				"NumberFormatException was expected");
		
		Assertions.assertEquals("For input string: \"One\"", thrown.getMessage());
	}

	@Test
	void testExpectedExceptionWithParentType() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Integer.parseInt("One");
		});
	}

}
