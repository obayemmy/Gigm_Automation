package com.gigm.testcases;

import java.io.IOException;
import org.testng.annotations.Test;

import com.gigm.base.TestBase;
import com.gigm.pages.HomePage;
import com.gigm.pages.LoginPage;

public class ValidateLogin extends TestBase{
	LoginPage login;
	HomePage home;
	@Test(priority=0)
	public void invalidLogin() throws IOException, InterruptedException {
		login = new LoginPage(driver);
		home = new HomePage(driver);
		home.ghanaAds();
		login.loginBtn();
		login.ValidateEmailField();
		login.enterInvalidEmail("");
		login.enterPassword("");
		login.clickSignIn();
	}

	@Test(priority=1)
	public void validLogin() throws InterruptedException, IOException {		
		Thread.sleep(2000);
		home.ghanaAds();
		login.loginBtn();
		login.clearEmaail();
		login.enterValidEmail("");
		login.clearPassword();
		login.enterPassword("");
		Thread.sleep(2000);
		login.clickSignIn();
		Thread.sleep(7000);

	}
}

