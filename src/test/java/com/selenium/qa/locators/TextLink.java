package com.selenium.qa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.qa.constants.URLConstants;

public class TextLink {
	
	public static final String GOOGLE_SIGN_IN_ID_TEXT= "Sign in";

	// public static final String GOOGLE_URL= "https://www.google.co.in";

	public static void getElementByTextLink(WebDriver driver) {
		
		// Always use the text as it is visible to eyes on page
		// For example a text might be lower case in Inspect element, 
		// but it might appear in Upper case due to some CSS classes

		driver.findElement(By.linkText(GOOGLE_SIGN_IN_ID_TEXT)).click();
		
		// or you can find same element by its id
		// driver.findElement(By.id("gb_70")).click();
		
		// Wait the program till the navigation completes after the click
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlContains(URLConstants.GOOGLE_SIGN_IN_PAGE_FRACTION_URL));
	}
}
