package com.awardSpaces.nesh.selenium1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver dv1 = new FirefoxDriver();
		
		dv1.get("https://www.google.com/");
		dv1.quit();

	}

}
