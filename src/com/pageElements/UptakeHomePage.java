package com.pageElements;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.testCases.Browser;

public class UptakeHomePage extends LoadableComponent<UptakeHomePage> {

	private static String url = "http://uptake.com";

	public UptakeHomePage() {
		
		PageFactory.initElements(Browser.driver(), this);
	}

	@Override
	public void load() {
		Browser.open(url);
	}

	@Override
	public void isLoaded() {
		assertTrue(uptakelogo.getText().equalsIgnoreCase("UPTAKE"));
	}

	public void close() {
		Browser.close();
	}

	public Whatwedo Whatwedo() {
		Whatwedo whatwedo = new Whatwedo();
		return whatwedo;
	}

	@FindBy(className = "mainlogo")
	public WebElement uptakelogo;

	@FindBy(xpath = ".//*[@style='color: #fd7e31;']")
	public WebElement learnMoreLink;

	@FindBy(xpath = ".//*[@href='http://uptake.com/what-we-do/']")
	private WebElement learnMoreLink1;

	@FindBy(id = ".//*/li[1]/a")
	private WebElement whatWeDo;

	@FindBy(xpath = ".//*/li[2]/a")
	private WebElement joinUS;

	@FindBy(xpath = ".//a[@href='http://uptake.com/ourblog/']")
	private WebElement ourBlog;

	@FindBy(xpath = ".//*[@id='uptake_homeslide_1']/article/div[2]")
	private WebElement nextSlideVbutton;

}
