package otherQuestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstarpDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mdbootstrap.com/docs/jquery/components/dropdowns/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle mr-4 waves-effect waves-light']")).click();
		
		 List<WebElement> list = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
		
		 for(int i =0; i<list.size();i++){
			 
			 System.out.println(list.get(i).getText());
			 
			 if(list.get(i).getText().equals("Another action")){
				 list.get(i).click();
				 break;
				 
			 }
		 }
		
		
		
	}

}
