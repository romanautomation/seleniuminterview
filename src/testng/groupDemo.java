package testng;

import org.testng.annotations.Test;

public class groupDemo {

	
	@Test(groups={"First group","Test group"})
	public void group1(){
		System.out.println("Group 1");
	}
	
	@Test(groups="Second group")
	public void group2(){
		System.out.println("Group 2");
	}
}
