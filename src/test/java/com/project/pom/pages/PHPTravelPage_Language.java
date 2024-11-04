package com.project.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.project.pom.Base;

public class PHPTravelPage_Language extends Base{
	
	By languageBtnLocator = By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[1]/a");
	By germanLanguageBtnLocator = By.cssSelector("a[href='https://phptravels.net/language/de/Germany/LTR']");
	By messageHomePageLocator = By.xpath("//*[@id=\"fadein\"]/main/div[1]/div[2]/div[1]/h4/strong");

	public PHPTravelPage_Language(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void selectGermanLanguage() throws InterruptedException {
		click(languageBtnLocator);
		Thread.sleep(2000);
		click(germanLanguageBtnLocator);
	}
	
	public boolean isLanguageChanged(String expectedPhrase) {
		String homepageMessage = getText(messageHomePageLocator);
		return homepageMessage.contains(expectedPhrase);
	}

}
