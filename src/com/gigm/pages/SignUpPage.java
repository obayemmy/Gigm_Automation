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

	
	public void enterfullName(String fullName) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("fullNameFiedl_ID"))).sendKeys(fullName);
	}
	
	public void clickgenderDropdown( ) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("genderDropdown_ID"))).click();
	}
	
	public void selectFemale( ) throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("femaleSelected_XPATH"))).click();
	}
	
	public void entermobileNumber( String phoneNumber) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("phoneNumberField_ID"))).sendKeys(phoneNumber);
	}
	
	public void enterPassword( String passwords) throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("passwordField_XPATH"))).sendKeys(passwords);
	}
	
	public void confirmPassword( String confirmPassword) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("confirmPassword_ID"))).sendKeys(confirmPassword);
	}
	
	public void enterEmail( String Cemail) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("emailField_ID"))).sendKeys(Cemail);
	}
	
	public void clickSignUpVtn() throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("signUpBtn_ID"))).click();
	}
	
	public void validateTandC( ) {
		String text = "Terms & Conditions";
		if(driver.getPageSource().contains("text")) {
			System.out.println(text + "is displayed on the sign up page ");
		}else {System.out.println(text + " is not displayed");
			
		}
	}
	public void GIGMLogo()  {
		try {
			driver.findElement(By.xpath(Utility.fetchLocator("gigmLogo"))).click();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
