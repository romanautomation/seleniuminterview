package testpractical;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		linkList.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Size of links & images "+linkList.size());
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		for(int i=0;i<linkList.size();i++){
			
//			System.out.println(linkList.get(i).getAttribute("href"));
			
			if(linkList.get(i).getAttribute("href")!=null){
				
				activeLinks.add(linkList.get(i));
				
			}
		}
		
		System.out.println("Size of active links & images "+activeLinks.size()); 
		
//		check href using HttpConnection API
		
		for(int i=0;i<activeLinks.size();i++){
	        HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(i).getAttribute("href")).openConnection();
	        
	        connection.connect();
	        String response = connection.getResponseMessage();
	        connection.disconnect();
	        
	        System.out.println(activeLinks.get(i).getAttribute("href")+"-->"+ response);
		}
		
	}

}
