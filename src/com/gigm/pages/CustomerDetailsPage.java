package com.gigm.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gigm.utility.Utility;

public class CustomerDetailsPage {
	WebDriver driver;
	public CustomerDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	public void bookerFullName(String fName) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("bookerFullNameField_ID"))).sendKeys(fName);
	}
	public void genderDropdown() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("genderDropdwon_XPATH"))).click();
	}

	public void genderSelected() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("femaleGender_XPATH"))).click();
	}

	public void bookerEmail(String bookeremail) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("bookerEmail_ID"))).sendKeys(bookeremail);
	}

	public void countryDropdown() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("countryDropdown_XPATH"))).click();
	}

	public void NigSelected() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("NigSelected_XPATH"))).click();
	}

	public void bookerPnoeNumber(String pNumber) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("bookerPhoneNumberField_ID"))).sendKeys(pNumber);
	}

	public void next_of_Kins_name(String kinName) throws IOException {
		driver.findElement(By.id(Utility.fetchLocator("nextOfKinName_ID"))).sendKeys (kinName);
	}

	public void next_of_kin_phone(String kinPhone) throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("nextOfKinPhone_XPATH"))).sendKeys(kinPhone);
	}

	public void paystackPayment() throws IOException {
		driver.findElement(By.cssSelector(Utility.fetchLocator("payStack_CSS"))).click();
	}

}
