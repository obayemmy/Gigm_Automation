package com.gigm.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.gigm.base.TestBase;
import com.gigm.pages.HomePage;
import com.gigm.pages.LoginPage;

public class ValidateLogin extends TestBase{
	
	@Test
	public void Login() throws IOException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		home.ghanaAds();
		login.loginBtn();
		login.enterEmail("email_XPATH");
		login.enterPassword("password_TEXT");
		login.clickSignIn();
	}
}
