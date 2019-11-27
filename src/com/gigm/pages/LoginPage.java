package com.gigm.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.gigm.utility.Utility;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void loginBtn() throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("loginModal_ID"))).click();	
	}

	public void enterValidEmail( String email) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("email_ID"))).sendKeys(Utility.fetchLocator("email_TEXT"));
	}
	
	public void enterInvalidEmail( String email) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("email_ID"))).sendKeys(Utility.fetchLocator("invalidEmail_TEXT"));
	}
	
	public void clearEmaail() throws IOException  {
		driver.findElement(By.id(Utility.fetchLocator("email_ID"))).clear();
	}

	public void enterPassword(String password) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("password_ID"))).sendKeys(Utility.fetchLocator("password_TEXT"));
	}
	
	public void clearPassword() throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("password_ID"))).clear();
	}

	public void clickSignIn() throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("LoginBtn_ID"))).click();

	}
	
	public void closeLoginModal() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("closeLoginModal_XPATH"))).click();
	}
}
	
