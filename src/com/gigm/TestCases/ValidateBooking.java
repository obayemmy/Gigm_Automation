package com.gigm.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.gigm.base.TestBase;
import com.gigm.dataSupplier.BookerDetails;
import com.gigm.pages.CustomerDetailsPage;
import com.gigm.pages.HomePage;
import com.gigm.pages.SeatSelectionPage;

public class ValidateBooking extends TestBase{
	CustomerDetailsPage customer;
	HomePage home ;
	SeatSelectionPage seat;
	@Test(dataProvider ="Booker", dataProviderClass=BookerDetails.class)
	public void bookAticket( String fName, String bookeremail, String pNumber, String kinName, String kinPhone ) throws IOException, InterruptedException {
		home = new HomePage(driver);
		seat = new SeatSelectionPage(driver);
		customer = new CustomerDetailsPage(driver);
		home.clickGhanaAds();
		home.departureTerminal();
		home.departRoutel();
		home.arrivalTerminal();
		home.arrivalRoute();
		home.dateField();
		home.seatDropdn();
		home.selectedSeat();
		home.bookNowBtn();
		Thread.sleep(3000);
		seat.validateBusAvailabilityText();
		Thread.sleep(1000);
		seat.validateDepartureDate();
		seat.validateNumberOfSeats();
		Thread.sleep(2000);
		seat.viewSeatsBtn();
		Thread.sleep(2000);
		seat.selectedSeat();
		seat.continueBtn();
		Thread.sleep(2000);
		seat.continueWithoutSignIn();
		customer.bookerFullName(fName);
		customer.genderDropdown();
		customer.genderSelected();
		customer.bookerEmail(bookeremail);
		customer.countryDropdown();
		customer.NigSelected();
		customer.bookerPnoeNumber(pNumber);
		customer.next_of_Kins_name(kinName);
		customer.next_of_kin_phone(kinPhone);
		customer.paystackPayment();
		Thread.sleep(6000);
	}

}
