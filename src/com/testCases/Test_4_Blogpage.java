package com.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.pageElements.BlogPage;

@Test
public class Test_4_Blogpage {

	WebDriver driver;
	static String url = "http://uptake.com";

	public void testBlogpage() {
		BlogPage blogpage = new BlogPage();
		Browser.open(url);
		blogpage.getBlogpage();
		blogpage.getFacebook();
	}
      
	@AfterClass
	public void closeDriver() throws Exception {
		Browser.close();
		
	}}

