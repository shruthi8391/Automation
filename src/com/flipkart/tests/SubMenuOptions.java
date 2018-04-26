package com.flipkart.tests;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.flipkart.generics.GenericUtils;
import com.flipkart.pages.LaunchPage;

public class SubMenuOptions {
	
	@Test
	public void subMenuOptions()
	{
		System.setProperty("web.chrome.driver", ",/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		LaunchPage lp = new LaunchPage(driver);
		lp.clickSubMenu(driver);
		
	}
	
	

}
