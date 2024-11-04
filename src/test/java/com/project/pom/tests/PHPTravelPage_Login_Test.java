package com.project.pom.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.project.pom.pages.PHPTravelPage_Login;

public class PHPTravelPage_Login_Test {
	
	WebDriver driver;
	PHPTravelPage_Login phpTravelPage_Login;

	@Before
	public void setUp() throws Exception {
		
		phpTravelPage_Login = new PHPTravelPage_Login(driver);
		driver = phpTravelPage_Login.chromeDriverConnection();
		driver.manage().window().maximize();
		phpTravelPage_Login.visit("https://phptravels.net/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	
	@Test
	public void loggingWithValidCredentials() throws InterruptedException {
		phpTravelPage_Login.logIn("admin@phptravels.com", "demoadmin");
		
		Thread.sleep(2000);
		
		assertTrue(phpTravelPage_Login.isLogged());
		
	}
	
	
	@Test 
	public void loggingWithWrongPassword() throws InterruptedException {
		phpTravelPage_Login.logIn("admin@phptravels.com", "12345");
		Thread.sleep(2000);
		
		assertTrue(phpTravelPage_Login.isWrongPasswordDisplay("https://phptravels.net/login"));
	}
	
	
	

}
