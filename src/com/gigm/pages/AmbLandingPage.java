package com.gigm.pages;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;

import com.gigm.utility.Utility;

public class AmbLandingPage {
	WebDriver driver;
	public AmbLandingPage(WebDriver driver) {
		this.driver = driver;
	}
	public void findOutMoreBtn() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("FindOutMore_XPATH"))).click();
	}
	
	public void gigNationLogo() {
		try {
			assertTrue(driver.getPageSource().contains("GIGNationLogo_XPATH"));
			}catch(ElementNotVisibleException e) {
				System.out.println("GIG_NATION emblem is  displayed");
			}
	}
	public void enterEmail (String AmbPassword) throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator(AmbPassword)));
	}
	public void enterPassword(String AmdEmail) throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator(AmdEmail)));
	}
	public void clickSignBtn() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("AmbSignInBtn_XPATH")));
	}


}
