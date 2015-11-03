package com.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.testCases.Browser;

public class BlogPage extends LoadableComponent<BlogPage> {
	static String url = "http://uptake.com";

	public BlogPage() {

		PageFactory.initElements(Browser.driver(), this);
	}
	


	@FindBy(xpath = ".//a[@href='http://uptake.com/ourblog/']")
	public WebElement ourBlog;

	
	@FindBy(xpath = ".//*[@class='share-facebook']")
	public WebElement facebooklink;
	  
	public void getFacebook (){
		facebooklink.click();
	}
	public void getBlogpage() {
	
		ourBlog.click();
	}
	
	
	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub

	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub


	}
	
	

}