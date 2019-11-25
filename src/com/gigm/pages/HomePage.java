package com.gigm.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.gigm.utility.Utility;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void ghanaAds() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("ghanaAds_XPATH"))).click();	
	}

}
