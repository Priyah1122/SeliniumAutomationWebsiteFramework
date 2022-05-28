package com.seleniumAutomationWebsiteFrameworkProject.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.seleniumAutomationWebsiteFrameworkProject.pages.BaseClass;
import com.seleniumAutomationWebsiteFrameworkProject.pages.LoginPage;
import com.seleniumAutomationWebsiteFrameworkProject.utility.BrowserFactory;
import com.seleniumAutomationWebsiteFrameworkProject.utility.ExcelProvider;

public class LoginTestCrm extends BaseClass {
	
	
	@Test
	public void loginApp()
	{
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		lp.fullName(excel.getStringData("Automation", 0, 0),excel.getStringData("Automation", 0, 1));
		lp.address(excel.getStringData("Automation", 1, 0));
		lp.email(excel.getStringData("Automation", 2, 0));
		lp.phoneNumber(excel.getStringData("Automation", 3, 0));
		//lp.mButton();
		lp.fButton();
		lp.hobbies();
		lp.langTab(excel.getStringData("Automation", 4, 0));
		lp.langTab(excel.getStringData("Automation", 5, 0));
		lp.langTab(excel.getStringData("Automation", 6, 0));
		lp.skillsTab();
		//lp.skillsTab(excel.getStringData("Automation", 7, 0));
		
		
	}
	

}
