package org.browser;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest {
	@BeforeMethod
	public void StartTime() {
		System.out.println("Start Time");
	}

	@AfterMethod
	public void EndTime() {
		System.out.println("EndTime");
	}
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("Launch Browser");
	}
	@AfterClass
	public void CloseBrowser() {
		System.out.println("CloseBrowser");
	}
	@Test
	public void Test1() {
		System.out.println("Test1");
	}
	@Test
	public void Test2() {
		System.out.println("Test2");
	}

}
