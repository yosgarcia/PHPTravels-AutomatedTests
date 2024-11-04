package com.project.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.project.pom.Base;

public class PHPTravelPage_Login extends Base {
	
	By accountDropdownLocator = By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[3]");
	By loginBtnLocator = By.cssSelector("a[href='https://phptravels.net/login']");
	
	By emailLocator = By.id("email");
	By passwordLocator = By.id("password");
	By submitBtnLocator = By.id("submitBTN");
	
	By loggedInLocator = By.xpath("//*[@id=\"fadein\"]/main/div/div/div/div[1]/div/div/div/div[3]/span");
	
	By wrongPasswordLocator = By.xpath("/div/div/h4");
	public PHPTravelPage_Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void logIn(String email, String password) throws InterruptedException {
		click(accountDropdownLocator);
		Thread.sleep(1000);
		click(loginBtnLocator);
		
		Thread.sleep(2000);
		type(email,emailLocator);
		type(password, passwordLocator);
		click(submitBtnLocator);
	}
	
	public boolean isLogged() {
		return isDisplayed(loggedInLocator);
	}
	
	public boolean isWrongPasswordDisplay(String url) {
		return getUrl().equals(url);
	}

}
