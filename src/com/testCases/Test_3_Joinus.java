package com.testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.pageElements.JoinUsPage;

@Test
public class Test_3_Joinus {

	static String url = "http://uptake.com";

	public void testJoinuspage() throws Exception {
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JoinUsPage joinus = new JoinUsPage();
		joinus.getJoinUspage();
		// Thread.sleep(9000);

	}

	@AfterClass
	public void closeDriver() throws Exception {
		Browser.close();

	}
}
