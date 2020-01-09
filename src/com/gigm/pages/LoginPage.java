package com.gigm.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.gigm.utility.Utility;

public class LoginPage {
String	errorMsg="Password or username incorrect";

WebDriver driver;
public LoginPage(WebDriver driver) {
	this.driver = driver;
}

public void loginBtn() throws IOException {
	driver.findElement(By.xpath(Utility.fetchLocator("loginModal_XPATH"))).click();	
}

/*public void enterValidEmail( String email) throws IOException {
	driver.findElement(By.xpath(Utility.fetchLocator("email_XPATH"))).sendKeys(Utility.fetchLocator("email_TEXT"));
}*/

/*public void ValidateEmailField() {
	Assert.assertEquals("email_ID", "email_ID");
}*/

public void enterInvalidEmail( String email) throws IOException {
	driver.findElement(By.xpath(Utility.fetchLocator("email_XPATH"))).sendKeys(email);
}

public void clearEmaail() throws IOException  {
	driver.findElement(By.xpath(Utility.fetchLocator("email_XPATH"))).clear();
}

public void enterPassword(String password) throws IOException {
	driver.findElement(By.xpath(Utility.fetchLocator("password_XPATH"))).sendKeys(password);
}

public void clearPassword() throws IOException {
	driver.findElement(By.xpath(Utility.fetchLocator("password_XPATH"))).clear();
}
public void validateErrorMessage() throws IOException {
	driver.findElement(By.xpath(Utility.fetchLocator("loginErroMesg")));
	if(driver.getPageSource().contains(errorMsg)){
		System.out.println( errorMsg + " "+ "is displayed");
	}else { System.out.println("error message is not seen");
	
	}
}

public void clickSignIn() throws IOException {
	driver.findElement(By.id(Utility.fetchLocator("LoginBtn_ID"))).click();
}

public void closeLoginModal() throws IOException {
	driver.findElement(By.xpath(Utility.fetchLocator("closeLoginModal_XPATH"))).click();
	}
}

