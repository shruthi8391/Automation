package com.flipkart.pages;

//import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaunchPage {
	
	
	
	
	

	//declaration
	
	@FindBy(xpath="//a[contains(text(),'Signup')]")
	private WebElement LoginBtn;
	
	@FindBy(xpath="//a[@title='Electronics']")
	private WebElement MenuElectronics;
	
	@FindBy(xpath="(//a[@title='Samsung'])[1]")
	private WebElement subMenuSamsung;
	
	//initialization
	public LaunchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void loginBtnClick()
	{
		LoginBtn.click();
	}
	
	public void clickSubMenu(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(MenuElectronics).click(subMenuSamsung);
		
	}
}
