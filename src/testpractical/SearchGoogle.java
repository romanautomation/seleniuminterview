package testpractical;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchGoogle {

	
	
	
	public static void main(String[] args) {
		
//		WebDriverManager.chromedriver().config();
		
		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='text' and @name='q']")).sendKeys("testing");;
		
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='sbl1']"));
		
		System.out.println("Size of List "+ list.size());
		
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals("testing")){
				list.get(i).click();
				break;
			}
		}
		
		
	}
}
