package com.gigm.pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.gigm.utility.Utility;

public class SeatSelectionPage {
	String expectedText = "Bus Availability";
	String actualText ="Bus Availability";
	String departureTime, numberOfSeat;
	WebDriver driver;
	private boolean WebElement;

	public SeatSelectionPage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickViewSeatBtn() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("viewSeat_XPATH"))).click();
	}
	public void validateBusAvailabilityText() {
		Assert.assertEquals(actualText, expectedText);
	}
	public void validateDepartureDate() throws IOException {
		WebElement date=	driver.findElement(By.xpath(Utility.fetchLocator("departureDate_XPATH")));
		String departureDate =date.getText();
		System.out.println("The departure date is " + departureDate);
	}

	public void validateNumberOfSeats() throws IOException {
		WebElement seatsAvailable = driver.findElement(By.xpath(Utility.fetchLocator("numberOfSeats_XPATH")));
		numberOfSeat = seatsAvailable.getText();
		System.out.println("The numbers of seat is " +  numberOfSeat);
	}
	public void validateDepartureTime() throws IOException {
		departureTime = driver.findElement(By.xpath(Utility.fetchLocator("departureTime_XPATH"))).getText();
		System.out.println("The departure time is " + departureTime);
	}
	public void viewSeatsBtn() throws IOException {
		WebElement viewSeat= driver.findElement(By.xpath(Utility.fetchLocator("viewSeatBtn_XPATH")));
		viewSeat.click();
		String seat = viewSeat.getText();	
		System.out.println(seat);
	}
	public void  selectedSeat() throws IOException  {
	
	try
    {
		//seat9_CSS  seat9_CSS
        WebElement seat14 = driver.findElement(By.cssSelector(Utility.fetchLocator("seat14_CSS")));

        if(seat14.isDisplayed() && seat14.isEnabled())
        {
        	seat14.click();
        }
    }
    catch(Exception e)
    {
        WebElement seat12 = driver.findElement(By.cssSelector(Utility.fetchLocator("seat12_CSS")));

        if(seat12.isDisplayed() && seat12.isEnabled())
        {
            seat12.click();
        }
    }
		/*
		 else if(Utility.fetchProperty("browserName").toString().equalsIgnoreCase("firefox")) {
			//set property and create instance of chrome firefox
			System.setProperty("webdriver.gecko.driver", projectPath+"\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		//	System.out.println(browserName + " browser running");
		}
		 */
			// TODO Auto-generated catch block*
		
	}
		
	public void continueBtn() throws IOException {
		driver.findElement(By.linkText(Utility.fetchLocator("continueBtn_LINKTEXT"))).click();
	}
	
	public void continueWithoutSignIn() throws IOException {
	WebElement cWL	=driver.findElement(By.linkText(Utility.fetchLocator("ContinueWithouSignIn_LINKTEXT")));
	cWL.click();
	}
}
