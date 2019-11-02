package testpractical;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FlipkartFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("t shirt");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Select selectPrice = new Select(driver.findElement(By.xpath("//div[@class='_3Uy12X']//div[@class='_1YoBfV']//select[@class='fPjUPw']")));
		selectPrice.selectByValue("1000");
		
		//driver.findElement(By.xpath("//div[text()='Wrangler']")).click();
		
		driver.findElement(By.xpath("//a[@title='Solid Men Polo Neck Yellow T-Shirt']")).click();
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println(parentWindowId);
		
		String childWindowId = it.next();
		System.out.println(childWindowId);
		
		String attribute = driver.findElement(By.xpath("//span[text()='Size']")).getAttribute("id");
		System.out.println(attribute);
		
		driver.findElement(By.xpath("//a[@class='_1TJldG _2I_hq9 _2UBURg']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter delivery pincode']")).sendKeys("411020");
		
		String titleExpected="Solid Men Polo Neck Yellow T-Shirt"; 
		Assert.assertEquals("Solid Men Polo Neck Yellow T-Shirt", titleExpected,"Title Not match");
		
		driver.findElement(By.xpath("//butto`								n[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		
	}

}
