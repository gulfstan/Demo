package com.testCases;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.pageElements.UptakeHomePage;

public class Test_2_Learnmore {
	
	static String url = "http://uptake.com";

	@Test
	public void gotoWhatwedoPage() {
		UptakeHomePage homepage = new UptakeHomePage();
		Browser.open(url);
		homepage.Whatwedo().whatwedopage();
	}

	@AfterClass
	public void closeDriver() throws Exception {
		Browser.close();

	}}

