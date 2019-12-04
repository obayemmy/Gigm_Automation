package com.gigm.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.gigm.assertions.Assertions;
import com.gigm.base.TestBase;
import com.gigm.dataSupplier.DataGenerator;
import com.gigm.pages.HomePage;
import com.gigm.pages.LoginPage;

public class ValidateLogin extends TestBase{
	LoginPage login;
	HomePage home;
	Assertions assertion;
	String errorMsg = "Password or username incorrect";
	@Test(dataProvider ="Excel", dataProviderClass=DataGenerator.class)
	public void Login(String email, String password) throws Exception{
		login = new LoginPage(driver);
		home = new HomePage(driver);
		assertion = new Assertions();
		home.clickGhanaAds();
		login.loginBtn();
		login.ValidateEmailField();
		login.clearEmaail();
		login.enterInvalidEmail(email);
		
		login.clearPassword();
		login.enterPassword(password);
		login.clickSignIn();
		Thread.sleep(3000);
		login.validateErrorMessage();
		Assertions.validateErrorMsg(driver, errorMsg);
	}

	

}

