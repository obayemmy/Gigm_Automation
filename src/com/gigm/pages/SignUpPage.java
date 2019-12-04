package com.gigm.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.gigm.utility.Utility;

public class SignUpPage {
	
	WebDriver driver;
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public void enterfullName( String email) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("fullNameFiedl_ID"))).sendKeys(Utility.fetchLocator("fullName_TEXT"));
	}
	
	public void clickgenderDropdown( ) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("genderDropdown_ID"))).click();
	}
	
	public void selectFemale( ) throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("femaleSelected_XPATH"))).click();
	}
	
	public void entermobileNumber( String email) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("phoneNumberField_ID"))).sendKeys(Utility.fetchLocator("phoneNumber"));
	}
	
	public void enterPassword( String email) throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("passwordField_XPATH"))).sendKeys(Utility.fetchLocator("password_TEXT"));
	}
	
	public void confirmPassword( String email) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("confirmPassword_ID"))).sendKeys(Utility.fetchLocator("confirmPassword"));
	}
	
	public void enterEmail( String email) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("emailField_ID"))).sendKeys(Utility.fetchLocator("email_TEXT"));
	}
	
	public void clickSignUpVtn( String email) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("signUpBtn_ID"))).click();
	}
	
	public void validateTandC( ) {
		String text = "Terms & Conditions";
		if(driver.getPageSource().contains("text")) {
			System.out.println(text + "is displayed on the sign up page ");
		}else {System.out.println(text + " is not displayed");
			
		}
	}
	
	

}
