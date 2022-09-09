package _testNG_Assertions_;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _Assartions_method_ {
	
    //1. assertEquals
	@Test
	public void test1() {
		Reporter.log("running test1", true);
		String expect = "good morning";
		String actual = "good morning";
		assertEquals(actual, expect, "act & ext result is diffrent");
	}
	//2. assertNotEquals
	@Test
	public void test2() {
		Reporter.log("running test2", true);
		String expect = "good night";
		String actual = "good night 1";
		assertNotEquals(actual, expect, "act & ext result is same");
	}
	//3. assertTrue
	@Test
	public void test3() {
		Reporter.log("running test3", true);
		boolean result = true;
		assertTrue(result, "result is false");
	}	
	//4. assertFalse
		@Test
		public void test4() {
			Reporter.log("running test4", true);
			boolean result = false;
			assertFalse(result, "result is true");
		}
		//5. assertNull
		@Test
		public void test5() {
			Reporter.log("running test5", true);
			String result = null;
			assertNull(result, "result is not null");
		}
		//6. assertNotNull
		@Test
		public void test6() {
			Reporter.log("running test6", true);
			String result = "psr";
			assertNotNull(result, "result is null");
		}
		//7. fail()
		@Test
		public void test7() {
			Reporter.log("running test7", true);
			fail();
		}
		
		
		
		
	
}
