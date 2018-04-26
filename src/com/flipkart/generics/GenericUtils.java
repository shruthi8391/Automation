package com.flipkart.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GenericUtils {
	
	public static void HandleDropDownMenu(WebDriver driver, WebElement target) {
		
		Actions act = new Actions(driver);
		act.moveToElement(target);
	}

}
