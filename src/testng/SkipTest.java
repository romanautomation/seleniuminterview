package testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SkipTest {

	
	
	@Test(groups="first")
	public void initialisation(){
		
		Assert.assertEquals(false, true);
	}
	
	@Test(dependsOnMethods="initialisation")
	public void Login(){
		
	}
	
	@Test(dependsOnGroups="first")
	public void Login2(){
		
	}
	@AfterMethod
	public void close(){
		
	}
}
