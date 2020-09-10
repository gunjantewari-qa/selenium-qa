package com.selenium.qa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.qa.constants.DataConstants;

public class InputBox {
	
	public static final String GOOGLE_USERNAME_INPUT_BOX_ID = "identifierId";
	public static final String GOOGLE_LOGIN_NEXT_BTN_ID = "identifierNext";
	
	public static void enterTextInInputBox(WebDriver driver) {
		WebElement googleUserNameInputBox = driver.findElement(By.id(GOOGLE_USERNAME_INPUT_BOX_ID));
		WebElement googleLoginNextBtn = driver.findElement(By.id(GOOGLE_LOGIN_NEXT_BTN_ID));
		googleUserNameInputBox.sendKeys(DataConstants.DATA_GOOGLE_USERNAME);
		googleLoginNextBtn.click();	
	}
}
