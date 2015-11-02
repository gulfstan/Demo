package com.pageElements;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.testCases.Browser;

public class Learnmore extends LoadableComponent<Learnmore>{
	
	
	UptakeHomePage homepage = new UptakeHomePage();
	public Learnmore(){
		PageFactory.initElements(Browser.driver(), this);
	}
	@Override
	protected void isLoaded() throws Error {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}
 public void close(){
	 Browser.close();
 }
}
