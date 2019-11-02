package otherQuestion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			int i = 10/0;
			
			System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println();
	}
	
	public void test(){
		try {
			
			int i=0/6;
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println();
		}
		int j=10;
		System.out.println("print");
	}

}
