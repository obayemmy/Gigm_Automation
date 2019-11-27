package com.gigm.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.gigm.utility.Utility;

public class FooterLinks {
	WebDriver driver;
	public FooterLinks(WebDriver driver) {
		this.driver = driver;
	}

	public void aboutUsLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("aboutUsLink_XPATH"))).click();	
	}

}
