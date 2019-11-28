package com.gigm.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.gigm.utility.Utility;

public class HomePage {
	WebElement element = null;
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void ghanaAds() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("ghanaAds_XPATH"))).click();	
	}
	public void navigateBackward() {
		driver.navigate().back();
	}
	
	public void navigateForward() {
		driver.navigate().forward();
	}

	public void gigmExperienceLink() throws IOException {
		Actions action = new Actions(driver);
		WebElement hover =driver.findElement(By.xpath(Utility.fetchLocator("gigmExperiencelink_XPATH")));
		action.moveToElement(hover).build().perform();
	}

	public void learningAcademyLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("learningAcademyLink_XPATH"))).click();
	}
	
	public void travelsAndToursLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("travesAndToursLink_XPATH"))).click();	
	}
	
	public void safetyLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("safetyLink_XPATH"))).click();	
	}
	
	public void busHireLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("busHireLink_XPATH"))).click();	
	}
	
	public void priorityServiceLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("priorityServicesLink_XPATH"))).click();	
	}
	
	public void signUpBtn() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("signUpBtn_XPATH"))).click();	
	}
	public void logisticsLinkn() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("logisticsLink_XPATH"))).click();	
	}
	public void couponsLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("couponsLink_XPATH"))).click();	
	}
	public void ourAppLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("ourAppLink_XPATH"))).click();	
	}
	public void ambassador() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("becomeAnAmbassadorLink_XPATH"))).click();	
	}
	public void pickUpServiceLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("pickUpServiceLink_XPATH"))).click();	
	}
	public void enterprisePartnerLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("enterprisePartnerLink_XPATH"))).click();	
	}
	public void becomAmbassadorLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("BAALink_XPATH"))).click();	
	}
	
	public void countrySwitcher() throws IOException {
		Actions action = new Actions(driver);
		WebElement hover =driver.findElement(By.xpath(Utility.fetchLocator("countrySwitcher_XPATH")));
		action.moveToElement(hover).build().perform();
	}



	
	
	
public void aboutUs() throws IOException {
	driver.findElement(By.xpath(Utility.fetchLocator("aboutUsLink_XPATH"))).click();
}

public void awards() throws IOException {
	driver.findElement(By.xpath(Utility.fetchLocator("awardsLink_XPATH="))).click();
}
public void busTerminal() throws IOException {
	driver.findElement(By.xpath(Utility.fetchLocator("busTerminalLink_XPATH"))).click();
}

}
