package com.project.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.project.pom.Base;

public class PHPTravelPage_Tours extends Base{
	
	// Find Tours Locators
	By toursBtnLocator = By.xpath("//*[@id=\"navbarSupportedContent\"]/div[1]/ul/li[3]/a");
	By cityTourLocator = By.xpath("//*[@id=\"tours-search\"]/div/div[1]/div[1]/span/span[1]/span/span[2]/b");
	By tourSearchBtnLocator = By.xpath("//*[@id=\"tours-search\"]/div/div[4]/button");
	By selectedTourCityLocator = By.id("select2-tours_city-container");
	By citySearchInputLocator = By.className("select2-search__field");
		

	public PHPTravelPage_Tours(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void searchTours(String city) throws InterruptedException {
		
		click(toursBtnLocator);
		
		click(cityTourLocator);
		
		type(city, citySearchInputLocator);
		Thread.sleep(1000);
		
		type("\n", citySearchInputLocator);
		
		click(tourSearchBtnLocator);
		
	}
	
	public boolean isCityTourSelected(String expectedCity) {
        String selectedCityText = getText(selectedTourCityLocator);
        return selectedCityText.toLowerCase().contains(expectedCity.toLowerCase()); 
    }
	

}
