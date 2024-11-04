package com.project.pom.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.project.pom.pages.PHPTravelPage_Language;

public class PHPTravelPage_Language_Test {
	
	private WebDriver driver;
	PHPTravelPage_Language phpTravelPage_Language;

	@Before
	public void setUp() throws Exception {
		
		phpTravelPage_Language = new PHPTravelPage_Language(driver);
		driver = phpTravelPage_Language.chromeDriverConnection();
		driver.manage().window().maximize();
		phpTravelPage_Language.visit("https://phptravels.net/");
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testChangeLanguageOfPage() throws InterruptedException {
		phpTravelPage_Language.selectGermanLanguage();
		Thread.sleep(3000);
		assertTrue(phpTravelPage_Language.isLanguageChanged("Ihre Reise beginnt hier!"));
	}

}
