package com.pageElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.testCases.Browser;

public class JoinUsPage extends LoadableComponent<JoinUsPage> {
   
	private static String url = "http://uptake.com";

	public JoinUsPage() {

		PageFactory.initElements(Browser.driver(), this);
	}

	@FindBy(id = ".//*/li[1]/a")
	public WebElement whatWeDo;

	@FindBy(xpath = ".//*/li[2]/a")
	public WebElement joinUS;

	@FindBy(xpath = ".//a[@href='http://uptake.com/ourblog/']")
	public WebElement ourBlog;

	@FindBy(className = "iCIMS_Header")
	public WebElement jobListings;

	@FindBy(className = "iCIMS_userMenuLink")
	public WebElement logbackin;

	@FindBy(id = "iCIMS_Paginator")
	public WebElement pageIndexdropdown;

	// Selecting page from Drop Down list Box
	// WebElement pageIndexdropdown =
	// driver.findElement(By.id("iCIMS_Paginator"));
	public void gotopage() {
		List<WebElement> options = pageIndexdropdown.findElements(By
				.tagName("1"));
		for (WebElement option : options) {
			if ("1".equals(option.getText()))
				option.click();
		}
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub

	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
	}

	public void getJoinUspage() {
		Browser.open(url);
		joinUS.click();

	}
   public void loginlink(){
	   logbackin.click();
   }
}
