package _testNG_Assertions_;


import org.testng.Assert;
import org.testng.annotations.Test;

public class _Verification_Hard_assert_ {

	@Test
	public void test1() {
		String exe = "good morning";
		String act = "good morning";
		boolean result = true;
		//1.Verification1
		Assert.assertEquals(act, exe, "Verification1 :act & exe result is different");
		
		//2.Verification2
		Assert.assertNotEquals(act, exe, "Verification2 :act & exe result is same");
		
		//3.Verification3
		Assert.assertTrue(result, "Verification3 :result is flase");
		
		//output
		
		//Verification2 :act & exe result is same did not expect [good morning] but found [good morning]
		
		// drowBack of Hard assert (static assert) is when one TC is fail he dot go next TC
		//for that Soft assert is introduces (non static assert)
	}
}
