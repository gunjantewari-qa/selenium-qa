package com.selenium.qa.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.qa.constants.CssConstants;
import com.selenium.qa.constants.DataConstants;
import com.selenium.qa.constants.URLConstants;
import com.selenium.qa.constants.XpathConstants;


public class CssSelector {

	

		public static void getElementBycssselctor(WebDriver driver) {
			//driver.findElement(By.cssSelector(Cssconstrants.GOODREADS_BOOK_LINK)).click();
			
			// Wait the program till the navigation completes after the click
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.urlContains(URLConstants.GOOGLE_SIGN_IN_PAGE_FRACTION_URL));
			
// List <WebElement> Books = driver.findElements(By.cssSelector(Cssconstrants.GOOGLE_URL));
 //for (WebElement Book : Books) 
 {
	// System.out.println(Book.getAttribute("alt"));
	// System.out.println(""----------"");
	 
 }}
	 
	 
 


	
	
	}


