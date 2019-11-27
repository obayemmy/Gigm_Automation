package com.gigm.headerTestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.gigm.base.TestBase;
import com.gigm.pages.FooterLinks;
import com.gigm.pages.HomePage;

public class CheckHeaderLinks extends TestBase{
	HomePage home ;
	FooterLinks footer ;
	@Test
	public void checkHeaderLinks() throws IOException, InterruptedException {
		home = new HomePage(driver);
		home.ghanaAds();
		home.gigmExperienceLink();
		home.learningAcademyLink();
		Thread.sleep(2000);
		home.navigateBackward();
		Thread.sleep(4000);
		home.ghanaAds();
		home.gigmExperienceLink();
		home.travelsAndToursLink();
		Thread.sleep(2000);
		home.navigateBackward();
		Thread.sleep(2000);
		home.ghanaAds();
		home.gigmExperienceLink();
		home.safetyLink();
		Thread.sleep(3000);
	}
	
	@Test
	public void checkFooterLinks() throws IOException, InterruptedException {
		footer= new FooterLinks(driver);
		home.ghanaAds();
		Thread.sleep(2000);
		footer.aboutUsLink();
		
	}
	
	

}
