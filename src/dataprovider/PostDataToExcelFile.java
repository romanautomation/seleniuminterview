package dataprovider;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import net.sf.jxls.reader.XLSReader;

public class PostDataToExcelFile {

	public static WebDriver driver;
	
	@Test
	public void postData(){
		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
//		 .//*[@id='customers']/tbody/tr[2]/td[1]
//		.//*[@id='customers']/tbody/tr[3]/td[1]
		
		String beforeXpath_company = ".//*[@id='customers']/tbody/tr[";
		String afterXpath_company = "]/td[1]";
		
		String beforeXpath_contact = "";
		String afterXpath_contact = "";
		
		String beforeXpath_country = "";
		String afterXpath_country = "";
		
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("Total number of rows"+rows.size());
		int rowount= rows.size();
		
//		XLSReader reader = new XLSReader("C:\\Users\\swapnil\\workspace\\new2\\SeleniumInterview\\src\\dataprovider\\TestData2.xlsx");
		
		XLsre reader = new Xls_Reader();
		
		
		for(int i=2;i<=rowount;i++){
			
			String actualXpath_company = beforeXpath_company+i+afterXpath_company;
			
			String CompanyName = driver.findElement(By.xpath(actualXpath_company)).getText();
			System.out.println(CompanyName);
		}
		
		
		
	}
	
}
