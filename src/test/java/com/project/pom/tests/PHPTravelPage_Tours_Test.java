package com.project.pom.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.project.pom.pages.PHPTravelPage_Tours;

public class PHPTravelPage_Tours_Test {
	
	private WebDriver driver;
	PHPTravelPage_Tours phpTravelPageTours;


	@Before
	public void setUp() throws Exception {
		
		phpTravelPageTours = new PHPTravelPage_Tours(driver);
		driver = phpTravelPageTours.chromeDriverConnection();
		driver.manage().window().maximize();
		phpTravelPageTours.visit("https://phptravels.net/");
	}

	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}

	@Test
	public void testFindToursByCityName() throws InterruptedException {
		phpTravelPageTours.searchTours("Dubai");
		Thread.sleep(3000);
		
		assertTrue(phpTravelPageTours.isCityTourSelected("Dubai"));
	}

}
