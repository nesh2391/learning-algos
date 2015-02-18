package com.awardSpaces.nesh.Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondSelenium {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Neshant/Desktop/Development/apps/SeleniumVersions/ChromeDrivers/chromedriver.exe");
		ChromeDriver inst = new ChromeDriver();
		inst.get("https://www.google.com/");
		WebElement wb = inst.findElement(By.xpath("//*[@id='gbqfq']"));
		//WebElement wb=driver.findElement(By.name("q"));
		wb.sendKeys("Hello");
		
		WebElement wb1 = inst.findElement(By.xpath("//*[@id='gbqfb']"));
		wb1.click();
		//inst.quit();
	}

}
