package com.gigm.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.gigm.base.TestBase;
import com.gigm.pages.HomePage;
import com.gigm.pages.SeatSelectionPage;

public class ValidateBooking extends TestBase{
	HomePage home ;
	SeatSelectionPage seat;
	@Test()
	public void bookAticket() throws IOException, InterruptedException {
		home = new HomePage(driver);
		seat = new SeatSelectionPage(driver);
		home.clickGhanaAds();
		Thread.sleep(2000);
		home.departureTerminal();
		Thread.sleep(2000);
		home.departRoutel();
		Thread.sleep(3000);
		home.arrivalTerminal();
		Thread.sleep(4000);
		home.arrivalRoute();
		Thread.sleep(3000);
		home.dateField();
		Thread.sleep(2000);
		home.day();
		Thread.sleep(2000);
		home.seatDropdn();
		Thread.sleep(2000);
		home.selectedSeat();
		home.bookNowBtn();
		Thread.sleep(7000);
		//	seat.validateBusAvailabilityText();
		seat.validateDepartureDate();
		seat.validateNumberOfSeats();


	}

}
