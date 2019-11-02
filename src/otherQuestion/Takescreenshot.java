package otherQuestion;

import java.io.File;
//import java.sql.Driver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.ClickAction;

public class Takescreenshot {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		 driver.navigate().to("http://google.com");
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		takeScreenShot("facbook_loginPage");
		
		driver.close();
	}

	public static void takeScreenShot(String sheetName) throws IOException{
		
		File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(file, new File("C:\\Users\\swapnil\\workspace\\new2\\SeleniumInterview\\src\\screenshots\\"+sheetName+".jpg"));
	}
}
