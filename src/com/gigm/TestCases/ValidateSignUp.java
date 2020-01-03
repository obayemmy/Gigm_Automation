package com.gigm.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.gigm.base.TestBase;
import com.gigm.pages.HomePage;
import com.gigm.pages.SignUpPage;

public class ValidateSignUp extends TestBase{
	SignUpPage sign;
	HomePage homepage;
	@Test
	public void signUp() throws IOException, InterruptedException {
		homepage= new HomePage(driver);
		sign = new SignUpPage(driver);
		homepage.clickGhanaAds();	
		homepage.signUpBtn();
		Thread.sleep(2000);
		sign.enterfullName("");
		sign.clickgenderDropdown();
		sign.selectFemale();
		sign.entermobileNumber("");
		sign.enterEmail("");
		sign.enterPassword("");
		sign.confirmPassword(null);
		sign.validateTandC();
		Thread.sleep(2000);
		
		
		
	}

}
