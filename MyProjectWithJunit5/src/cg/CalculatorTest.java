package cg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	static Calculator ob;
	@BeforeAll
	public static void beforeAllTest() //JUNIT 4 @BEFORE CLASS
	{
		System.out.println("BEFORE ALL TESTS");
		ob=new Calculator();
	}
	@AfterAll
	public static void afterAllTest() //JUNIT 4 @After CLASS
	{
		System.out.println("After ALL TESTS");
		ob=new Calculator();
	}
	@BeforeEach
	public void beforeEachTest() //JUNIT 4 @BEFORE
	{
		System.out.println("Before each test");
		ob=new Calculator();
	}
	@AfterEach
	public void AfterEachTest()
	{
		System.out.println("After Each Test");
		ob=null;
	}

	@Test
	void testadd() {
		System.out.println("Test case testadd");
		//Assert.assertEquals(9,ob.add(4,5));
		assertEquals(9,ob.add(4, 5));
	}
	@RepeatedTest(5)
	//@Test
	void testadd1() {
		System.out.println("Test case testadd");
		//Assert.assertEquals(9,ob.add(4,5));
		assertTrue(ob.add(4, 5)>0);
		assertTrue(ob.add(4, -5)>=0);
	}
	@Disabled
	@Test
	void testidgenerator() {
		System.out.println("Test case idgenerator");
		//Assert.assertEquals(9,ob.add(4,5));
		assertTrue(ob.idgenerator()>0);
	}
	


}
