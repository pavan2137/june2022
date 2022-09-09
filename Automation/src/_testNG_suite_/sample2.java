package _testNG_suite_;



import org.testng.Assert;
import org.testng.annotations.Test;

public class sample2 {
	@Test
	public void TC4() {
		System.out.println("run TC: 4");
	}

	@Test
	public void TC5() {
		System.out.println("run TC: 5");
		Assert.fail();
	}

	@Test
	public void TC6() {
		System.out.println("run TC: 6");
	}
}

