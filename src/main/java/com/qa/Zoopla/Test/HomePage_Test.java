package com.qa.Zoopla.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Zoopla.Base.Browser;
import com.qa.Zoopla.Pages.HomePage;

public class HomePage_Test extends Browser
{
	//WebDriver driver; 
	HomePage hp;			//reference of HomePage class declared here to create object of Homepage, to call HomePage methods here
	
	
	// to start application and browser before every test
	@BeforeMethod
	public void startApp()
	{
		driver = Browser.startApplication("chrome", "https://www.goibibo.com/flights/");
		hp =new HomePage();				// HomePage object created here to call HomePage methods in every test
	}

	
	@Test
	public void validateHomepageTitle()
	{
		
		String title = "Flight Tickets, Flights Booking at Lowest Airfare, Book Air Tickets-Goibibo";
		
		String actualTitle = hp.homepageTitle();
		Assert.assertEquals(actualTitle, title,"Actual title didnot match expected title");
		
	}
	
	@Test
	public void studentBarIsNotSelectedValidation()
	{
		boolean flag = hp.studentFareNotSelected(); // flag value should be false, as by default student bar should not be selected
		Assert.assertEquals(flag, false);
	}
	
	
	// to close browser after every test
	@AfterMethod
	public void closeBrowser()
	{
		Browser.tearDown();
	}

}
