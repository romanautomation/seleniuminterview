package otherQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Displayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Boolean b1 = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		System.out.println(b1);
		
		Boolean b2 = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(b2);
		
		//driver.findElement(By.xpath("//input[@type='radio']")).click();
		Boolean b3 = driver.findElement(By.xpath("//input[@type='radio']")).isSelected();
		System.out.println(b3);
		
	}

}
