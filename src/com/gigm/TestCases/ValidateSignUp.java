package com.gigm.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.gigm.base.TestBase;
import com.gigm.dataSupplier.CustomerLogin;
import com.gigm.dataSupplier.CustomerSignUp;
import com.gigm.pages.HomePage;
import com.gigm.pages.SignUpPage;

public class ValidateSignUp extends TestBase{
	SignUpPage signUp;
	HomePage homepage;
	@Test(dataProvider ="Register", dataProviderClass=CustomerSignUp.class)
	public void signUp(String fullName,  String phoneNumber, String password, String confirmPassword,  String email) throws IOException, InterruptedException {
		homepage= new HomePage(driver);
		signUp = new SignUpPage(driver);
		homepage.clickGhanaAds();	
		homepage.signUpBtn();
		Thread.sleep(2000);
		signUp.enterfullName(fullName);
		signUp.clickgenderDropdown();
		signUp.selectFemale();
		signUp.entermobileNumber(phoneNumber);
		signUp.enterPassword(password);
		signUp.confirmPassword(confirmPassword);
		signUp.enterEmail(email);
		signUp.validateTandC();
		signUp.clickSignUpVtn();
		signUp.GIGMLogo();
		Thread.sleep(2000);
		
	}

}
