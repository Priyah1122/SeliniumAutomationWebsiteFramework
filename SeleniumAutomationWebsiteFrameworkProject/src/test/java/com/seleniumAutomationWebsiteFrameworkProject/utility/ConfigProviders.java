package com.seleniumAutomationWebsiteFrameworkProject.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigProviders {
	Properties pro;
	public ConfigProviders()
	{
		File src=new File("./Config/Config.properties");
		try 
		{
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);

		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Not able to access config file "+e.getMessage());
		}
	}

	public String getBrowser()
	{

		return pro.getProperty("Browser");

	}
	public String getUrl()
	{
		return pro.getProperty("qaUrl");

	}



}
