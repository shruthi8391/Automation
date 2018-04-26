package SeleniumConcepts;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		FileInputStream fip = new FileInputStream("./data/input.properties");
		Properties prop = new Properties();
		prop.load(fip);
		String url = prop.getProperty("URL");
		driver.get(url);
	}

}
