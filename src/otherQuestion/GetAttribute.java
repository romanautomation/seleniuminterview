package otherQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String firstName_attribute = driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("aria-label");
		String firstName_attribute1 = driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("type");
		
		System.out.println(firstName_attribute);
		System.out.println(firstName_attribute1);
		
//		firstName_element.sendKeys("TestToTest");
//		
//		String firstName_value = firstName_element.getAttribute("value");
//		System.out.println("First name value is "+firstName_value);
//		
//		String firstName_Text = firstName_element.getText();
//		System.out.println(firstName_Text);
//		
	}

}
