package com.seleniumAutomationWebsiteFrameworkProject.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;

	}

	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input") WebElement firstName;
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input") WebElement lastName;
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea") WebElement address;
	@FindBy(xpath="//*[@id=\"eid\"]/input") WebElement emailAddr;
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[4]/div/input") WebElement phoneNum;
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input") WebElement maleButton;
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input") WebElement femaleButton;
	@FindBy(xpath="//*[@id=\"checkbox1\"]") WebElement hCricket;
	@FindBy(xpath="//*[@id=\"checkbox2\"]") WebElement hMovies;
	@FindBy(xpath="//*[@id=\"checkbox3\"]") WebElement hHockey;
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select") WebElement languagesTab;
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]") WebElement arabic;
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[2]") WebElement bulgarian;
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[40]") WebElement urdu;
	@FindBy(xpath="//*[@id=\"Skills\"]") WebElement skills;
	@FindBy(xpath="//*[@id=\"Skills\"]/option[2]") WebElement adobe;





	public void fullName(String fName,String lName)
	{
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);

	}
	public void address(String addr)
	{
		address.sendKeys(addr);
	}
	public void email(String email)
	{
		emailAddr.sendKeys(email);
	}
	public void phoneNumber(String phoneNumber)
	{
		phoneNum.sendKeys(phoneNumber);
	}
	/*public void mButton()
	{
		maleButton.click();
	}*/
	public void fButton()
	{
		femaleButton.click();
	}
	public void hobbies()
	{
		hCricket.click();
		hMovies.click();
		hHockey.click();

	}
	public void langTab(String value)
	{
		languagesTab.click();
		if (value.equals(arabic.getText()))
		{arabic.click();}

		if (value.equals(bulgarian.getText()))
			bulgarian.click();

		if(value.equals(urdu.getText()))
			urdu.click();

	}
	public void skillsTab(String skillData)
	{
		Select stab=new Select(skills);
		//stab.selectByIndex(1);
		//stab.selectByValue("2");
		stab.selectByVisibleText(skillData);

	}
	public void skillsTab()
	{
		Select stab=new Select(skills);
		stab.selectByIndex(1);
		//stab.selectByValue("2");
		

	}














}
