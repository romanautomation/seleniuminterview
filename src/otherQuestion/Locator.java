package otherQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
//		id
//		
		driver.findElement(By.id("a")).sendKeys(null);
		
		driver.findElement(By.name("email")).sendKeys("test");
		
//		xpath
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("test2");
		
//		css selector
		driver.findElement(By.cssSelector("#u_0_l")).sendKeys("test3");
		
		
////		tagname
//		driver.findElement(By.tagName("input"));
		
//		name
		driver.findElement(By.name("reg_email__")).sendKeys("1122334455");
		
////		classname
//		driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("123456");
		
////		linktext
//		driver.findElement(By.linkText("Forgotten account?")).click();
		
//		partial link text
        driver.findElement(By.partialLinkText("Ter")).click();
	}

}
