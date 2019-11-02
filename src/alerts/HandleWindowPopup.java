package alerts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		String CurrentWindowHanndle1 = driver.getWindowHandle();
//		System.out.println(CurrentWindowHanndle1);
//		System.out.println("Current Window Title "+driver.getTitle());
	
		
		driver.findElement(By.xpath("//a[text()='Good PopUp #2']")).click();
		
//		String CurrentWindowHanndle2 = driver.getWindowHandle();
//		System.out.println(CurrentWindowHanndle2);
//		System.out.println("Current Window Title "+driver.getTitle());
		
		Set<String> handler= driver.getWindowHandles();
		
		Iterator<String> it= handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println(parentWindowId);
		
		String childWindowId = it.next();
		System.out.println(childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		System.out.println("Child window title "+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println("Parent window title "+driver.getTitle());
		
		
	}

}
