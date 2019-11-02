package testpractical;

import org.openqa.selenium.WebDriver;

public class FirefoxDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "E:\\E swapnil\\software\\Selenium\\gecko\\geckodriver.exe");
		WebDriver driver = new org.openqa.selenium.firefox.FirefoxDriver();
		driver.get("https://login.yahoo.com/");
	}

}
