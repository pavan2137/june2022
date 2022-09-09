package _testNG_Group_execution;

import org.testng.annotations.Test;

public class _Test_Group_ {

	@Test(groups = "whatapp")
	public void TC1() {
		System.out.println("running TC 1");
	}
	
	@Test(groups = "Facebook")
	public void TC2() {
		System.out.println("running TC 2");
	}
	
	@Test(groups = "whatapp")
	public void TC3() {
		System.out.println("running TC 3");
	}
	
	@Test(groups = "Facebook")
	public void TC4() {
		System.out.println("running TC 4");
	}
	
	@Test(groups = "whatapp")
	public void TC5() {
		System.out.println("running TC 5");
	}
	
	@Test(groups = "Gmail")
	public void TC6() {
		System.out.println("running TC 6");
	}
	
	@Test(groups = "whatapp")
	public void TC7() {
		System.out.println("running TC 7");
	}
	
	@Test(groups = "Facebook")
	public void TC8() {
		System.out.println("running TC 8");
	}
}
