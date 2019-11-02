package testng;

import org.testng.Assert;
import org.testng.annotations.Test;




public class ListenerDemo2 {

	
	
	
	@Test
	public void test1(){
	Assert.assertEquals(true, false);
	}
	
	@Test
	public void test2(){
		Assert.assertEquals(false, false);
	}
}
