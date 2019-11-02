package testpractical;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisplayErrorMessageOfForm {

	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		 
		System.setProperty("webdriver.gecko.driver", "E:\\E swapnil\\software\\Selenium\\gecko\\geckodriver.exe");
		driver = new org.openqa.selenium.firefox.FirefoxDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&dsh=S-1811898650%3A1568296296474583&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("eva@a.com");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
//		driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-primary block full-width m-b']")).click();
		

		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		List<WebElement> errorMessageList = driver.findElements(By.xpath("//div[@class='GQ8Pzc']"));
		int count = errorMessageList.size();
		System.out.println(count);
		
		for(int i=0; i<count;i++){
			
			String errorMessageText = errorMessageList.get(i).getText();
			System.out.println(errorMessageText);
			
		}
	}
	
  public static WebElement toShow(WebElement locator, WebDriver driver, int timeout){
		
		return new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
	}

}
