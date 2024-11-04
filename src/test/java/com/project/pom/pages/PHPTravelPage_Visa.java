package com.project.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project.pom.Base;

public class PHPTravelPage_Visa extends Base{
	
	By visaBtnLocator = By.cssSelector("a[href='https://phptravels.net/visa']");
	
	By cityFromDropdownLocator = By.xpath("//*[@id=\"visa-submit\"]/div/div[1]/div[1]");
	By cityToDropdownLocator = By.xpath("//*[@id=\"visa-submit\"]/div/div[2]/div[1]");
	
	By cityInputLocator = By.cssSelector("input[class='select2-search__field']");
	By selectCityFromLocator = By.className("visa_from");
	
	By searchBtnLocator = By.xpath("//*[@id=\"visa-submit\"]/div/div[4]/button");
	By textResult1Locator = By.id("fetchTo");
	By textResult2Locator = By.id("fetchFrom");
	
	
	// Locators for form
	By nameLocator = By.name("first_name");
	By lastNameLocator = By.name("last_name");
	By emailLocator = By.name("email");
	By phoneLocator = By.name("phone");
	By submitLocator = By.xpath("//*[@id=\"submit\"]");
	By resultMessageLocator = By.xpath("//*[@id=\"fadein\"]/main/div/div/div/div/div/div/div/h2");
	
	
	
	

	public PHPTravelPage_Visa(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void consultVisa(String cityFrom, String cityTo) throws InterruptedException {
		click(visaBtnLocator);
		
		click(cityFromDropdownLocator);
		
		Thread.sleep(1000);
		
		Select selectListCityFrom = new Select(findElement(selectCityFromLocator));
		
		selectListCityFrom.selectByVisibleText(cityFrom);
		
		
		Thread.sleep(1000);
		
		click(cityToDropdownLocator);
		
		type(cityTo, cityInputLocator);
		Thread.sleep(1000);
		type("\n", cityInputLocator);
		
		click(searchBtnLocator);
		
	}
	
	
	public Boolean isCitiesDisplayed() {
		return isDisplayed(textResult1Locator) && isDisplayed(textResult2Locator);
	}
	
	public void fillForm() throws InterruptedException {
		if(isDisplayed(textResult1Locator)) {
			type("Isabel", nameLocator);
			type("Chaves", lastNameLocator);
			type("ichaves@gmail.com", emailLocator);
			type("123445678", phoneLocator);
			
			WebElement submitButton = findElement(submitLocator);
			
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitButton);
			
		} 
		else {
			System.out.println("Form is not present");
		}
	}
	
	public boolean isVisibleResultMessage() {
		return isDisplayed(resultMessageLocator);
	}

}
