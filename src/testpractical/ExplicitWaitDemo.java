package testpractical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		 
		System.setProperty("webdriver.gecko.driver", "E:\\E swapnil\\software\\Selenium\\gecko\\geckodriver.exe");
		driver = new org.openqa.selenium.firefox.FirefoxDriver();
		driver.get("http://138.197.213.237/auth-mvp-dev1/public/login?redirect_to=imagndev.com/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("eva@a.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-primary block full-width m-b']")).click();
		
//		String title = driver.getTitle();
//		System.out.println(title);
		
		driver.findElement(By.xpath("//button[@ng-click='addPatient()']")).click();
		
//		Thread.sleep(5000);
		
		WebElement backButton = driver.findElement(By.xpath("//a[@ng-click='retrunToPatient()']"));
		
		String returbButtontext = toShow(backButton, driver, 50).getText();
		System.out.println(returbButtontext);
	}
	
  public static WebElement toShow(WebElement locator, WebDriver driver, int timeout){
		
		return new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
	}

}
