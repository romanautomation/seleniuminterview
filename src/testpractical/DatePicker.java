package testpractical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
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
		
		String month_year = driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[2]")).getText();
		if(!(month_year.equals("August 2019"))){
			
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[1]")).click();
		}
		
		String before_xpath = "/html/body/div[3]/div[1]/table/tbody/tr[";
		String after_xpath = "]/td[";
		
		boolean flag = false;
		
		for(int rowNum=2;rowNum<=6;rowNum++){
			for(int colNum=1;colNum<=7;colNum++){
				
				String dateVal = driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).getText();
				
				System.out.println(dateVal);
				
				if(dateVal.equals("5"))
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

}
