package com.seleniumAutomationWebsiteFrameworkProject.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.seleniumAutomationWebsiteFrameworkProject.utility.BrowserFactory;
import com.seleniumAutomationWebsiteFrameworkProject.utility.ConfigProviders;
import com.seleniumAutomationWebsiteFrameworkProject.utility.ExcelProvider;

public class BaseClass {

	public WebDriver driver;
	
	public ConfigProviders config; 	
	public ExcelProvider excel;
	
	@BeforeSuite
	public void setupSuite()
	{
		config=new ConfigProviders();
		excel=new ExcelProvider();
	}
	
	@BeforeClass
	public void setUp()
	{
		driver=BrowserFactory.startApplication(driver, config.getBrowser(),config.getUrl());	
	}
	
	/*@AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);	
	}*/
}
