package com.project.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.project.pom.Base;

public class PHPTravelPage_Hotels extends Base {
	
	By hotelsBtnLocator = By.xpath("//*[@id=\"navbarSupportedContent\"]/div[1]/ul/li[1]/a");
	By cityDropdownLocator = By.cssSelector(".select2-selection--single"); // Abre el dropdown de ciudades
	By citySearchInputLocator = By.className("select2-search__field");
	By searchBtnLocator = By.xpath("//*[@id=\"hotels-search\"]/div/div[5]/button");
	By selectedCityLocator = By.id("select2-hotels_city-container");

	public PHPTravelPage_Hotels(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	

	public void searchHotels(String city) throws InterruptedException {
		
		click(hotelsBtnLocator);
		Thread.sleep(1000);
		
		click(cityDropdownLocator);
		Thread.sleep(1000);
		
		type(city, citySearchInputLocator);
		Thread.sleep(1000);
		
		type("\n", citySearchInputLocator);
				
		
		click(searchBtnLocator);
	}
	
	public boolean isCityHotelSelected(String expectedCity) {
        String selectedCityText = getText(selectedCityLocator);
        return selectedCityText.toLowerCase().contains(expectedCity.toLowerCase()); // Compara ignorando mayúsculas/minúsculas
    }

}
