package testng;

import java.util.List;

import org.testng.Assert;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;




@Listeners(CustomListener.class)
public class ListenerDemo implements IReporter {

	@Test
    public void test1(){
		
		Assert.assertEquals(false, true,"Test1 fail");
	}
	
	@Test
	public void test2(){
	
		Assert.assertEquals(true, true, "Test2 fail");
	}

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// TODO Auto-generated method stub
		
	}

	
	
}
