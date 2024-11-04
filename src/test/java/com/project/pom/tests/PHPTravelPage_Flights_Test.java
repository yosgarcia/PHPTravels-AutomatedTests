package com.project.pom.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.project.pom.pages.PHPTravelPage_Flights;

public class PHPTravelPage_Flights_Test {
	
	private WebDriver driver;
	PHPTravelPage_Flights phpTravelPage_Flights;

	@Before
	public void setUp() throws Exception {
		phpTravelPage_Flights = new PHPTravelPage_Flights(driver);
		driver = phpTravelPage_Flights.chromeDriverConnection();
		driver.manage().window().maximize();
		phpTravelPage_Flights.visit("https://phptravels.net/");
	}

	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}

	@Test
	public void testRoundTripInputVisibilityWhenSelectec() throws InterruptedException {
		phpTravelPage_Flights.selectRoundTripFlight();
		Thread.sleep(2000);
		assertTrue(phpTravelPage_Flights.isReturnDateDisplayed());
	}

}
