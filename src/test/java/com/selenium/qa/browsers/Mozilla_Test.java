package com.selenium.qa.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mozilla_Test {

	private static final String MOZILLA_DRIVER_KEY = "webdriver.gecko.driver";
	private static final String MOZILLA_DRIVER_PATH = "D:\\Code_Workspace\\geckodriver.exe";
	
	public static void main(String[] args) {
		System.setProperty(MOZILLA_DRIVER_KEY, MOZILLA_DRIVER_PATH);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.print(driver.getTitle());
		//System.out.print(driver.getPageSource());
		driver.navigate().to("https://www.facebook.com");
		System.out.print(driver.getTitle());
		System.out.print(driver.getCurrentUrl());
		System.out.print(driver.getWindowHandle());
		
		// explicitly navigating to a URL
		driver.navigate().to("https://facebook.com");
		
		// navigating back
		driver.navigate().back();
		// navigating forward
		driver.navigate().forward();
		// refreshing page
		driver.navigate().refresh();
		
	}
}
