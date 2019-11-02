package webdrivermanager;

import org.openqa.selenium.WebDriver;



import io.github.bonigarcia.wdm.WebDriverManager;
import testpractical.FirefoxDriver;

public class FirefoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new org.openqa.selenium.firefox.FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
	}

}
