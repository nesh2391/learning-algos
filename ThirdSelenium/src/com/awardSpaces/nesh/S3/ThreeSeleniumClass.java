package com.awardSpaces.nesh.S3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ThreeSeleniumClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = null;
		String browser = "FireFox";
		
		if(browser.equals("IE"))
		{
			driver = new InternetExplorerDriver();
		}
		else if(browser.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("FireFox"))
		{
			ProfilesIni allProf = new ProfilesIni();
			FirefoxProfile prof = allProf.getProfile("SeleniumClass");
			driver = new FirefoxDriver(prof);
		}
		
		driver.get("https://www.google.com");
		WebElement wb = driver.findElement(By.xpath("//*[@id='gbqfq']"));
		//WebElement wb=driver.findElement(By.name("q"));
		wb.sendKeys("Hello");
		
		WebElement wb1 = driver.findElement(By.xpath("//*[@id='gbqfb']"));
		wb1.click();
	}

}
