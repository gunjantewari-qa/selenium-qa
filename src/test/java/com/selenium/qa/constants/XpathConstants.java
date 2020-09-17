package com.selenium.qa.constants;

public class XpathConstants {
	
	// XPath is a query language to select a node on the HTML/XHTML pages
	// The syntax is: Start with double forward slash followed by tagName followed by square brackets 
	// containing @attributeName and its value

	public static final String GOOGLE_SIGN_IN_BTN_XPATH = "//a[@id='gb_70']";
	public static final String GOOGLE_SIGN_IN_INPUT_BOX_XPATH = "//input[@id='identifierId']";
	
	// The syntax for using a xpath via text link is
	public static final String GOOGLE_SIGN_IN_TEXT_XPATH = "//a[text(),'Sign in']";
	
	// The syntax to use select a node whose attribute contains a value is
	// public static final String GOOGLE_SIGN_IN_PARTIAL_TEXT_XPATH = "//a[contains(@id, 'aSubstringOfId')]";
	public static final String GOOGLE_SIGN_IN_PARTIAL_TEXT_XPATH = "//a[contains(text(), 'aSubstringOfId')]";
	// a similar method is starts-with; ex:
	public static final String GOOGLE_SIGN_IN_STARTS_WITH_TEXT_XPATH = "//a[starts-with(text(), 'startingText')]";
	
	// The syntax can also be used in combination with AND and OR
	public static final String GOOGLE_SIGN_IN_INPUT_BOX_COMPOSITE_XPATH = "//input[@id='identifierId' or @class='someClass']";
	
	// in case the target element is fluctuating we can use * in place of the tag
	public static final String GOOGLE_SIGN_IN_INPUT_BOX_WILD_CARD_XPATH = "//*[@id='identifierId' or @class='someClass']";
	
//using parent or child to locate a specific node with  respect to another one
	
	public static final String GOOGLE_SIGN_IN_INPUT_BOX_PARENT_TO_CHILD_XPATH = "//div[@id='identifierId']/child::div[3]";
	

    public static final String GOOGLE_SIGN_IN_INPUT_BOX_CHILD_TO_PARENT_XPATH = "//div[@id='identifierId']/parent::*";
 
    //  by using Descendant  finding standard node -
    
   // public static final String GOOGLE_SIGN_IN_INPUT_BOX__Descendant_XPATH = "//div[@id='identifierId']/descendant::div[2]";
    
   // by using ancestor  finding standard node -
    
    public static final String GOOGLE_SIGN_IN_INPUT_BOX__Ancestor_XPATH = "//div[@id='identifierId']/ancestor::div[2]";
//OR
   // public static final String GOOGLE_SIGN_IN_INPUT_BOX__Ancestor_XPATH = "//div[@id='identifierId']/ancestor::*";
    
} 
    
    
    
    