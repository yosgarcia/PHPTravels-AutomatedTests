package com.project.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.project.pom.Base;

public class PHPTravelPage_Flights extends Base {
	
	
	By flightsBtnLocator = By.cssSelector("a[href='https://phptravels.net/flights']");
	
	By roundTripBtnLocator = By.xpath("//*[@id=\"flights-search\"]/div[1]/div[1]/div/div/div/div[2]");
	By returnDateInputLocator = By.id("return_date");
	
	public PHPTravelPage_Flights(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void selectRoundTripFlight() {
		click(flightsBtnLocator);
		
		
		click(roundTripBtnLocator);
		
				
	}
	
	public boolean isReturnDateDisplayed() {
		return isDisplayed(returnDateInputLocator);
	}
	
	

}
