package _testNG_Assertions_;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _Verification_soft_assert_ {

	@Test
	public void test1() {
		String act = "good morning";
		String exe = "good morning";
		boolean result = true;
		
		SoftAssert soft = new SoftAssert();
		//1. Verification1
		soft.assertNotEquals(act, act, "Verification1: result is equals");
		
		//2. Verification2
		soft.assertEquals(act, exe, "Verification2: result is not equils");
		
		//3. Verification3
		soft.assertTrue(result, "Verification3: result is flase");
		
		soft.assertAll();
	}
}
