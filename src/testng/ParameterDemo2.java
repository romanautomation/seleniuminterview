package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;

public class ParameterDemo2 {

	
	@Test
	public void browserValidation(String browser){
		if(browser.equals("chrome")){ 
			System.out.println("Chrome Browser");
		} else if(browser.equals("firefox")) {
			System.out.println("Firefox browser");
		}
	}
}
