package com.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testCases.Browser;

public class Whatwedo {
	
	static String url = "http://uptake.com";

	

	public Whatwedo() {
	
		PageFactory.initElements(Browser.driver(), this);
	}

public Learnmore  whatwedopage() {
learnmorelink.click();
	return new Learnmore();
}
@FindBy (partialLinkText = "LEARN MORE")
private WebElement learnmorelink;
	@FindBy(id = ".//*/li[1]/a")
	public WebElement whatWeDo;

	@FindBy(xpath = ".//*/li[2]/a")
	public WebElement joinUS;

	@FindBy(xpath = ".//a[@href='http://uptake.com/ourblog/']")
	public WebElement ourBlog;
	
	@FindBy(xpath = ".//*[@href='https://www.facebook.com/uptake']")
	public WebElement facebooklink;

	@FindBy(xpath = ".//*[@href='https://twitter.com/Uptake']")
	public WebElement twitterLink;

	@FindBy(id = ".//*[@href='https://www.linkedin.com/company/3845987']")
	public WebElement linkedin;

	@FindBy(partialLinkText = "info@uptake.com")
	public WebElement infoemailLink;

	@FindBy(partialLinkText = "jobs@uptake.com")
	public WebElement jobsemailLink;
	
	@FindBy(partialLinkText = ".//*/div[4]/div/div/div/p/span[1]")
	public WebElement allRightsReserved;

	@FindBy(partialLinkText = ".//*/div[4]/div/div/div/p/span[2]")
	public WebElement copyRight2015Uptake;
	
	@FindBy(partialLinkText = ".//*/div[3]/div/div/div/p/span[2]")
	public WebElement phonenumber;
	
}
