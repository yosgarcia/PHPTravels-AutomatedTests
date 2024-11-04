package com.project.pom.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.project.pom.pages.PHPTravelPage_Visa;

public class PHPTravelPage_Visa_Test {
	
	private WebDriver driver;
	PHPTravelPage_Visa phpTravelPage_Visa;

	@Before
	public void setUp() throws Exception {
		
		phpTravelPage_Visa = new PHPTravelPage_Visa(driver);
		driver = phpTravelPage_Visa.chromeDriverConnection();
		driver.manage().window().maximize();
		phpTravelPage_Visa.visit("https://phptravels.net/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	
	@Test
	public void testSearchVisaFormByCityNames() throws InterruptedException {
		phpTravelPage_Visa.consultVisa("Algeria", "Afghanistan");
		Thread.sleep(3000);
		assertTrue(phpTravelPage_Visa.isCitiesDisplayed());
	}
	
	
	@Test
	public void testFillFormVisa() throws InterruptedException {
		phpTravelPage_Visa.consultVisa("Algeria", "Afghanistan");
		
		Thread.sleep(3000);
		
		phpTravelPage_Visa.fillForm();
		
		Thread.sleep(4000);
		
		assertTrue(phpTravelPage_Visa.isVisibleResultMessage());
		
	}
	
	
	

}
