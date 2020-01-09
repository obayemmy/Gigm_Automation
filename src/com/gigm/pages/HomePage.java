package com.gigm.pages;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.gigm.utility.Utility;

public class HomePage {
	String gigLearningText="GIG Learning Academy";
	String AmbassadorvalidationText1="Be part of the movement";
	String AmbassadorvalidationText2 ="Make money by referring a friend to download and use the GIGM App";
	WebElement element = null;
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickGhanaAds() throws IOException {
		try {
		driver.findElement(By.xpath(Utility.fetchLocator("ghanaAds_XPATH"))).click();	
	}catch (Exception  exp) {
		System.out.println("Nsukka Ads is not displayed "  + exp.getCause());
		System.out.println("the reason is " + exp.getMessage());
	//	exp.printStackTrace();
	}
	}
		
	//try {home.clickGhanaAds();	
	//}catch (Exception e){
	//	System.out.println("Nsukka Ads is not displayed");	
//	}
	public void navigateBackward() {
		driver.navigate().back();
	}
	
	public void navigateForward() {
		driver.navigate().forward();
		
}

	public void gigmExperienceLink() throws IOException {
		Actions action = new Actions(driver);
		WebElement hover =driver.findElement(By.xpath(Utility.fetchLocator("gigmExperiencelink_XPATH")));
		action.moveToElement(hover).build().perform();
	}

	public void learningAcademyLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("learningAcademyLink_XPATH"))).click();
	}
	
	public void travelsAndToursLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("travesAndToursLink_XPATH"))).click();	
	}
	
	public void safetyLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("safetyLink_XPATH"))).click();	
	}
	
	public void busHireLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("busHireLink_XPATH"))).click();	
	}
	
	public void priorityServiceLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("priorityServicesLink_XPATH"))).click();	
	}
	
	public void signUpBtn() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("signUpBtn_XPATH"))).click();	
	}
	public void logisticsLinkn() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("logisticsLink_XPATH"))).click();	
	}
	public void couponsLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("couponsLink_XPATH"))).click();	
	}
	public void ourAppLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("ourAppLink_XPATH"))).click();	
	}
	public void ambassador() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("becomeAnAmbassadorLink_XPATH"))).click();	
	}
	public void pickUpServiceLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("pickUpServiceLink_XPATH"))).click();	
	}
	public void enterprisePartnerLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("enterprisePartnerLink_XPATH"))).click();	
	}
	public void becomAmbassadorLink() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocator("BAALink_XPATH"))).click();	
	}
	public void validateTextOnAmbassadorPage() {
		/*if(driver.getPageSource().contains(AmbassadorvalidationText1)) {
			System.out.println(AmbassadorvalidationText1 + "is present");
		}else {
			System.out.println(AmbassadorvalidationText1 + "not present");
		}*/
		try {
		assertTrue(driver.getPageSource().contains(AmbassadorvalidationText1));
		}catch(ElementNotVisibleException e) {
			System.out.println(AmbassadorvalidationText1 + "not displayed");
		}
	
	}
	
	public void countrySwitcher() throws IOException {
		Actions action = new Actions(driver);
		WebElement hover =driver.findElement(By.xpath(Utility.fetchLocator("countrySwitcher_XPATH")));
		action.moveToElement(hover).build().perform();
	}


public void gigLAcademy() {
	if(driver.getPageSource().contains("gigLearningAcademy_TEXT")) {
		System.out.println(gigLearningText +  " "  +"is displayed ");
	}else {
		System.out.println("GIG Learn Academy not seen");
	}
}
	
public void aboutUs() throws IOException {
	driver.findElement(By.xpath(Utility.fetchLocator("aboutUsLink_XPATH"))).click();
}

public void awards() throws IOException {
	driver.findElement(By.xpath(Utility.fetchLocator("awardsLink_XPATH="))).click();
}
public void busTerminal() throws IOException {
	driver.findElement(By.xpath(Utility.fetchLocator("busTerminalLink_XPATH"))).click();
}

public void departureTerminal() throws IOException {
	driver.findElement(By.xpath(Utility.fetchLocator("departureTerminal_XPATH"))).click();
	
}

public void departRoutel() throws IOException {
	//departRoute_XPATH
	driver.findElement(By.xpath(Utility.fetchLocator("akowonjoRoute_XPATH"))).click();
}

public void arrivalTerminal() throws IOException {
	driver.findElement(By.xpath(Utility.fetchLocator("abujaRoute_XPATH"))).click();
}
public void arrivalRoute() throws IOException {
	//arrivalRoute_XPATH
	driver.findElement(By.xpath(Utility.fetchLocator("arrivalRoute_XPATH"))).click();
}
//Select future date dynamically
public void dateField() throws IOException {
	java.util.Date date = new Date(0, 0, 0);
	 
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(date);
	calendar.add(Calendar.DATE, +1);
	date = calendar.getTime(); 
	String tommorowsDate = new SimpleDateFormat("MM/dd/yyyy").format(date);
	//enter tomorrow's date in the field
	WebElement tomDate = driver.findElement(By.xpath(Utility.fetchLocator("dateField_XPATH")));
	tomDate.sendKeys(tommorowsDate);
	System.out.println("tomorrow date is " + tommorowsDate );
	/*Calendar cal = Calendar.getInstance();
	cal.setTime(date);
	// Add one day to the today's date
	cal.add(Calendar.DATE, 1);
	
	String strMonth = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);

	String tommorowsDate = new SimpleDateFormat("MM/dd/yyyy").format(cal.getTime());
	System.out.println(tommorowsDate);*/
	
/*	 Calendar calendar = Calendar.getInstance();
	WebElement departDate =driver.findElement(By.xpath(Utility.fetchLocator("dateField_XPATH")));
	departDate.click();
	 departDate = (WebElement) calendar.getTime();
	 calendar.add(Calendar.DAY_OF_YEAR, 1);*/
	
	
}

public void day() throws IOException {
	driver.findElement(By.xpath(Utility.fetchLocator("day_XPATH"))).click();
}
public void seatDropdn() throws IOException {
	driver.findElement(By.xpath(Utility.fetchLocator("Seat_XPATH"))).click();
}

public void selectedSeat() throws IOException {
	driver.findElement(By.xpath(Utility.fetchLocator("selectedSeat_XPATH"))).click();
}
public void bookNowBtn() throws IOException {
	driver.findElement(By.xpath(Utility.fetchLocator("bookNowBtn_XPATH"))).click();
}




}
