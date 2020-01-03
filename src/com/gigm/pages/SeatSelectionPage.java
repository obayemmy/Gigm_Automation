package com.gigm.pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gigm.utility.Utility;

public class SeatSelectionPage {
	String expectedText = "Bus Availability";
	String actualText ="Bus Availability";
	String departureTime, numberOfSeat;
	WebDriver driver;
	WebElement date, seatsAvailable;
	public SeatSelectionPage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickViewSeatBtn() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("viewSeat_XPATH"))).click();
	}
	public void validateBusAvailabilityText() {
		assertEquals(driver.getPageSource().contains(actualText), expectedText);
	}
	public void validateDepartureDate() throws IOException {
		date =	driver.findElement(By.xpath(Utility.fetchLocator("departureDate_XPATH")));
		String departureDate =date.getText();
		System.out.println("The departure date is " + departureDate);
	}

	public void validateNumberOfSeats() throws IOException {
		seatsAvailable = driver.findElement(By.xpath(Utility.fetchLocator("numberOfSeats_XPATH")));
		numberOfSeat = seatsAvailable.getText();
		System.out.println("The numbers of seat is " +  numberOfSeat);
	}
	public void validateDepartureTime() throws IOException {
		departureTime = driver.findElement(By.xpath(Utility.fetchLocator("departureTime_XPATH"))).getText();
		System.out.println("The departure time is " + departureTime);
	}

}
