package com.testCases;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.pageElements.UptakeHomePage;

public class Test_1_HomePage {

	//WebDriver driver;
	static String url = "http://uptake.com";
	

	@Test
	public void verifyHomepage() {
		UptakeHomePage homepage = new UptakeHomePage();

		Browser.open(url);

		// test if main logo is present
		if (homepage.uptakelogo.isDisplayed()) {
			System.out.println("Logo displayed.");
		} else {
			System.out.println("Logo not displayed.");
		}
		// homepage.isLoaded();

		// opens up LEARN MORE link
		homepage.learnMoreLink.click();

	}

	@AfterClass
	public void closeDriver() throws Exception {
		Browser.close();
		
	}
}
