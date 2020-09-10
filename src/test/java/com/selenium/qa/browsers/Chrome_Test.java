package com.selenium.qa.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.qa.constants.URLConstants;
import com.selenium.qa.locators.Xpath;

public class Chrome_Test {

	private static final String CHROME_DRIVER_KEY = "webdriver.chrome.driver";
	private static final String CHROME_DRIVER_PATH = "D:\\Code_Workspace\\chromedriver.exe";
	
	public static void main(String[] args) {
		System.setProperty(CHROME_DRIVER_KEY, CHROME_DRIVER_PATH);
		WebDriver driver = new ChromeDriver();

		driver.get(URLConstants.GOOGLE_URL);
		
//		driver.get("https://www.google.com");
//		System.out.print(driver.getTitle());
//		//System.out.print(driver.getPageSource());
//		driver.navigate().to("https://www.facebook.com");
//		System.out.print(driver.getTitle());
//		System.out.print(driver.getCurrentUrl());
//		System.out.print(driver.getWindowHandle());
		
//		TextLink.getElementByTextLink(driver);
		
//		InputBox.enterTextInInputBox(driver);
		
		Xpath.getElementByTextPath(driver);
	}
	
	
}
