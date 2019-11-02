package testpractical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class DatePicker3 {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
//		/html/body/div[3]/div[1]/table/tbody/tr[2]/td[1]
//		/html/body/div[3]/div[1]/table/tbody/tr[2]/td[2]
//		/html/body/div[3]/div[1]/table/tbody/tr[2]/td[3]
		
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='dd/mm/yyyy']")).click();
		
//		/html/body/div[3]/div[1]/table/thead/tr[2]/th[2]
		
		selectDate(driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[2]")), 
				driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[1]")),
				"/html/body/div[3]/div[1]/table/tbody/tr[", 
				"]/td[", "5","August 2019");
		
	}

	
	public static void selectDate(WebElement month_year, WebElement clickButton, String before_xpath, String After_xpath, String Date, String m_y){
		
		String month_yea = month_year.getText();
		if(!(month_yea.equals(m_y))){
			
			clickButton.click();
		}
		
		String before_xpat = before_xpath;
		String after_xpat = After_xpath;
		
		boolean flag = false;
		
		for(int rowNum=2;rowNum<=6;rowNum++){
			for(int colNum=1;colNum<=7;colNum++){
				
				String dateVal = driver.findElement(By.xpath(before_xpat+rowNum+after_xpat+colNum+"]")).getText();
				
				System.out.println(dateVal);
				
				if(dateVal.equals(Date))
				{
					driver.findElement(By.xpath(before_xpat+rowNum+after_xpat+colNum+"]")).click();
					flag=true;
					break;
					
				}
			}
			
			if(flag)
				break;
		}
	}
	
}
