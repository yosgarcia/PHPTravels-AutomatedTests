package com.project.pom.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.project.pom.pages.PHPTravelPage_Hotels;

public class PHPTravelPage_Hotels_Test {
	
	
	private WebDriver driver;
	PHPTravelPage_Hotels phpTravelPage_Hotels;

	@Before
	public void setUp() throws Exception {
		
		phpTravelPage_Hotels = new PHPTravelPage_Hotels(driver);
		driver = phpTravelPage_Hotels.chromeDriverConnection();
		driver.manage().window().maximize();
		phpTravelPage_Hotels.visit("https://phptravels.net/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testFindHotelsByCityName() throws InterruptedException {
		phpTravelPage_Hotels.searchHotels("Singapore");
		Thread.sleep(3000);
		
		assertTrue(phpTravelPage_Hotels.isCityHotelSelected("Singapore"));
		
	}

}
