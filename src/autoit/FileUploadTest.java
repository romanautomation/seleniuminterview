package autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("file:///C:/Users/swapnil/Desktop/Selenium%20Notes/AutoIt/fileupload.html");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='file']")).click();
		
		Thread.sleep(8000);
		 
		Runtime.getRuntime().exec("C:\\Users\\swapnil\\Desktop\\Selenium Notes\\AutoIt\\Fileupload.exe");
		
		
	}

}
