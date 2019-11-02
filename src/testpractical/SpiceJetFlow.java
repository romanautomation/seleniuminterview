package testpractical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpiceJetFlow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated metSystem.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		driver.findElement(By.xpath("//a[text()=' Pune (PNQ)']")).click();
		
		Thread.sleep(10000);
		
//		driver.findElement(By.xpath("//a[text()=' Goa (GOI)']")).click();
		
		clickOn(driver.findElement(By.xpath("//a[text()=' Goa (GOI)']")), driver, 50);
		
		WebElement dateElement = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		String dateVal="30/12/2019";
		
		selectDateByJS(dateElement, driver, dateVal);
		
	}

	
	public static void selectDateByJS(WebElement element, WebDriver driver, String dateVal){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
	}
	
	public static void clickOn(WebElement locator, WebDriver driver, int timeout){
		
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
}
