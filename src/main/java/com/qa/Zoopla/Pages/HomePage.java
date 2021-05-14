package com.qa.Zoopla.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Zoopla.Base.Browser;


// Homepage web element and methods declared here


public class HomePage extends Browser
{
	
	//static WebDriver driver;
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	

	//Page Factory
	@FindBy(xpath="//input[@id='gosuggest_inputSrc']")		//start location web element
	WebElement from;
	
	@FindBy(id ="gosuggest_inputDest")			//destination location web element
	WebElement destination;
	
	@FindBy(id= "departureCalendar")		//departure date web element
	WebElement departureDate;
	
	@FindBy(id = "returnCalendar")			//Return date web element
	WebElement returnDate;
	
	@FindBy(id = "gi_search_btn")				//search button
	WebElement searchButton;
	
	@FindBy(id = "pax_label")					// no of traveller count
	WebElement noOfTravellersBox;
	
	@FindBy(id = "pax_link_common")				//Traveller 
	WebElement traveller;
	
	@FindBy(id = "adultPaxMinus")				//reducing no of adult traveller button
	WebElement minusAdultTraveller;
	
	@FindBy(id = "adultPaxPlus")				//adding adult traveller button
	WebElement plusAdultTraveller;
	
	@FindBy(id = "childPaxMinus")				//reducing child traveller button
	WebElement minusChildTraveller;
	
	@FindBy(id = "childPaxPlus")				//adding child traveller button
	WebElement plusChildTraveller;
	
	@FindBy(id = "infantPaxMinus")				//reducing infant traveller button
	WebElement minusInfantTraveller;
	
	@FindBy(id = "infantPaxPlus")				//adding infant traveller button
	WebElement plusInfantTraveller;
	
	@FindBy(id = "oneway")						// one way trip selection
	WebElement onewayTripSelection;
	
	@FindBy(id = "roundTrip")				//round trip selection 
	WebElement roundwayTripSelection;
	
	@FindBy(id = "multiCity")				//multi City selection
	WebElement multiCitySelection;
	
	@FindBy(xpath ="//div[@class='widgetUserBlock fl']")    //adult traveller widget
	WebElement adultTravellerWidget;
	
	@FindBy(xpath = "//li[@class='roomRow dF justifyBetween']")  //types of traveller adult , child, infant widget. Comes after clicking traveller 
	WebElement allTravellerWidget;
	
	@FindBy(xpath = "//select[@class='custSelect width100 whiteBg padTB5 padLR10']")         // travel class selection dropdown
	WebElement travellClassSelection;
	
	@FindBy(xpath = "//input[@id='student_fare_check']")    				//Student Fare checkbox
	WebElement studentFareCheckBox;
	
//	public static String homepageTitle()
//	{
//		String title= driver.getTitle();
//		return title;
//	}

	public String homepageTitle() 
	{
		String title= driver.getTitle();
		return title;
	}
	
	public void checkStudentFare()
	{
		studentFareCheckBox.click();
	}
	
	//this method should return false, as student bar should not be selected by default
	public boolean studentFareNotSelected()
	{
		return studentFareCheckBox.isSelected();
	}
	
	// method to enter start loaction
	public void enterStartLocation(String startLocation)
	{
		from.sendKeys(startLocation);
	}
	
	//method to enter destination address
	public void enterDestinationLocation(String destinationLocation)
	{
		destination.sendKeys(destinationLocation);
	}
	
	public void enterDepartureDate(String startDate)
	{
		departureDate.sendKeys(startDate);
	}
	

}
