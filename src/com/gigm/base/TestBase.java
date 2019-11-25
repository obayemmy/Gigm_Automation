package com.gigm.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.gigm.utility.Utility;

public class TestBase {
	public WebDriver driver ;
	public String projectPath = System.getProperty("user.dir");

	@BeforeSuite
	public void setUp() throws IOException {
		if(Utility.fetchProperty("browserName").toString().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver.exe");
			driver =new ChromeDriver();
		}

		else if(Utility.fetchProperty("browserName").toString().equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(Utility.fetchProperty("browserName").toString().equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", projectPath+"\\Drivers\\internetexplorerdriver.exe");
			driver = new InternetExplorerDriver();
		}else {
			System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get(Utility.fetchProperty("applicationUrl").toString());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	}








	@AfterSuite
	public void tearDown() {
		driver.quit();

	}

}
