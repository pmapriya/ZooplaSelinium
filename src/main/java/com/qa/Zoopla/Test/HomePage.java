package com.qa.Zoopla.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qa.Zoopla.Base.Browser;

public class HomePage 
{
	WebDriver driver; 
	
	@Test
	public void getTitle()
	{
		driver = Browser.startApplication("chrome", "https://www.goibibo.com/flights/");
		String title = driver.getTitle();
		System.out.println(title);
		
		Browser.tearDown();
	}
	
}
