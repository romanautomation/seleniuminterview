package actionclass;



import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAndDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		

		org.openqa.selenium.Dimension d = new org.openqa.selenium.Dimension(480, 620);
		
		driver.manage().window().setSize(d);
		
//		Actions action = new Actions(driver);
//		
////		action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).build().perform();   // right click
//		
//		action.doubleClick(driver.findElement(By.xpath("//span[text()='right click me']"))).build().perform();   // double click
////		driver.
	}

}
