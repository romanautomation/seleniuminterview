package testpractical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker2 {

	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "E:\\E swapnil\\software\\Selenium\\gecko\\geckodriver.exe");
		driver = new org.openqa.selenium.firefox.FirefoxDriver();
		
		driver.get("http://138.197.213.237/auth-mvp-dev1/public/login?redirect_to=imagndev.com/home");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("starkimbilling@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-primary block full-width m-b']")).click();
		
		
		toShow(driver.findElement(By.xpath("//a//span[text()='Manage Billing']")), driver, 60).click();
	
		
//		/html/body/div[3]/div[1]/table/tbody/tr[2]/td[1]
//		/html/body/div[3]/div[1]/table/tbody/tr[2]/td[2]
//		/html/body/div[3]/div[1]/table/tbody/tr[2]/td[3]
		
//		toShow(driver.findElement(By.xpath("//input[@type='text' and @placeholder='dd/mm/yyyy']")), driver, 50).click();
		
		toShow(driver.findElement(By.xpath("//a[@href='#/manage-billing/list-case-invoice']")), driver, 50).click();
		
		toShow(driver.findElement(By.xpath("//input[@id='due_date_picker_from']")), driver, 50).click();
		
//		/html/body/div[3]/div[1]/table/thead/tr[2]/th[2]
		
		String month_year = toShow(driver.findElement(By.xpath("//th[@class='datepicker-switch']")), driver, 50).getText();
		 
		if(!(month_year.equals("July 2018"))){
			
			toShow(driver.findElement(By.xpath("//th[@class='prev']")), driver, 50).click();
			
		}
		
//		/html/body/div[6]/div[1]/table/tbody/tr[2]/td[1]
//		/html/body/div[6]/div[1]/table/tbody/tr[2]/td[2]
				
				
				
		String before_xpath = "/html/body/div[6]/div[1]/table/tbody/tr[";
		String after_xpath = "]/td[";
		
		boolean flag = false;
		
		for(int rowNum=2;rowNum<=6;rowNum++){
			for(int colNum=1;colNum<=7;colNum++){
				
				String dateVal = driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).getText();
				
				System.out.println(dateVal);
				
				if(dateVal.equals("20"))
				{
					driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).click();
					flag=true;
					break;
					
				}
			}
			
			if(flag)
				break;
		}
	}

public static WebElement toShow(WebElement locator, WebDriver driver, int timeout){
		
		return new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
	}
}
