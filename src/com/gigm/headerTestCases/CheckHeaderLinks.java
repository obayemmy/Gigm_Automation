package com.gigm.headerTestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.gigm.base.TestBase;
import com.gigm.pages.HomePage;

public class CheckHeaderLinks extends TestBase{
	HomePage home ;
	JavascriptExecutor js;
	@Test(priority=0)
	public void checkHeaderLinks() throws IOException, InterruptedException {
		home = new HomePage(driver);
		home.ghanaAds();
		Thread.sleep(3000);
		home.gigmExperienceLink();
		home.learningAcademyLink();
		Thread.sleep(4000);
		home.navigateBackward();
		Thread.sleep(4000);
		home.ghanaAds();
		home.gigmExperienceLink();
		Thread.sleep(2000);
		home.travelsAndToursLink();
		Thread.sleep(2000);
		home.navigateBackward();
		Thread.sleep(2000);
		home.ghanaAds();
		home.gigmExperienceLink();
		Thread.sleep(3000);
		home.safetyLink();
		Thread.sleep(3000);
	}

	@Test(priority=1)
	public void FooterlinksCheck() throws InterruptedException, IOException {
		js	 = (JavascriptExecutor) driver;
		home.navigateBackward();
		Thread.sleep(3000);
		home.ghanaAds();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		home.aboutUs();
		Thread.sleep(3000);
	}
}
