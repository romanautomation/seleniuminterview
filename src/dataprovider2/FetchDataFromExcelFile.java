package dataprovider2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FetchDataFromExcelFile {

	WebDriver driver;
	String sheetName= "Sheet1";
	
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data= TestUtil.getTestData(sheetName);
		
		return data;
		
	}
	
	
	@Test(dataProvider="getData")
	public void login(String username, String password){
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	
		driver.get("http://imagndev.com/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	
	
	
           }
}
