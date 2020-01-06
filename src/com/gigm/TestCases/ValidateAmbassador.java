package com.gigm.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.gigm.base.TestBase;
import com.gigm.pages.HomePage;

public class ValidateAmbassador extends TestBase {
	HomePage home;
	@Test
	public void CheckAmbassador() throws IOException, InterruptedException {
		home = new HomePage(driver);
		home.clickGhanaAds();
		Thread.sleep(2000);
		home.becomAmbassadorLink();

	}
}
