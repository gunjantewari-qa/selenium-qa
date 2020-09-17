package com.selenium.qa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.qa.constants.DataConstants;
import com.selenium.qa.constants.URLConstants;
import com.selenium.qa.constants.XpathConstants;

public class Xpath {

	public static void getElementByTextPath(WebDriver driver) {
		driver.findElement(By.xpath(XpathConstants.GOOGLE_SIGN_IN_BTN_XPATH)).click();
		
		// Wait the program till the navigation completes after the click
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.urlContains(URLConstants.GOOGLE_SIGN_IN_PAGE_FRACTION_URL));
		

		driver.findElement(By.xpath(XpathConstants.GOOGLE_SIGN_IN_INPUT_BOX_XPATH)).sendKeys(DataConstants.DATA_GOOGLE_USERNAME);
	}
}
