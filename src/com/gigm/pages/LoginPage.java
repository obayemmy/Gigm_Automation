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

	public void enterEmail( String email) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("email_ID"))).sendKeys(Utility.fetchLocator("email_TEXT"));
	}


	public void enterPassword(String password) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("password_ID"))).sendKeys(Utility.fetchLocator("password_TEXT"));
	}


	public void clickSignIn() throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("LoginBtn_ID"))).click();

	}

}
