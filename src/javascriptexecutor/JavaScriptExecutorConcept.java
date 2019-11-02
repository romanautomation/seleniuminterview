package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		
//		driver.get("https://ui.freecrm.com/");
		driver.get("https://www.lipsum.com/");
		
		driver.manage().deleteAllCookies();
		
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
//	
//        WebElement loginBtn = driver.findElement(By.xpath("//div[text()='Login']"));
//		
		//executeScript - to execute java script code
		
//		flash(loginBtn, driver);
//		drawBorder(loginBtn, driver);
////		generateAlert(driver, "There is some problem with login button");
//		clickElementByJs(loginBtn, driver);
//		System.out.println(getTitleByJs(driver));
//		System.out.println(getPageInnerText(driver));

//        scrollPageDown(driver);
        WebElement policy = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
        scrollIntoView(policy, driver);
	}

	
	public static void flash(WebElement element, WebDriver driver){
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript(arg0, arg1)
		
		String bgcolor= element.getCssValue("backgroundColor");
		
		for(int i=0; i<100; i++){
			
			changeColor("(rgb(0,200,0))",element,driver);
			changeColor(bgcolor,element,driver);
		}
	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver){
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		
		try{
			
			Thread.sleep(20);
		}catch(InterruptedException e){
			
		}
	}
	
	public static void drawBorder(WebElement element, WebDriver driver){
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
	}
	
	public static void generateAlert(WebDriver driver, String message){
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");
		
	}
	
	
//	some time elements not vivsible. so we can used javascript execuotr because it directly hit java script library in html code

	public static void clickElementByJs(WebElement element, WebDriver driver){
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void refreshBrowserbyJs(WebDriver driver){
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
		
	}
	
	public static String getTitleByJs(WebDriver driver){
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String getPageInnerText(WebDriver driver){
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
		
	}
	
	public static void scrollPageDown(WebDriver driver){
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver){
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
}
 