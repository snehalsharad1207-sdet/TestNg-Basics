package Tests;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Loan {
	
	@AfterTest
	public void Aftest() 
	{
		System.out.println("AfterTest - is used to execute the method at the end of this 'loan' class file.");
		System.out.println("--------------------------------------------------------------");
	}
	
	@Parameters("URL")
	@Test
	public void TestCase1(String urlname) 
	{
		System.out.println("Test Case1 Executed");
		System.out.println("URL value from Loan File:" + urlname);
	}
	@Test
	public void TestCase2() 
	{
		System.out.println("Test Case2 Executed");
	}
	@AfterSuite
	public void Asuite() 
	{ 	
		System.out.println("After Suite - will be executed after all the test cases within an entire TestNG suite have completed their execution");
		
	}
	
	@BeforeSuite
	public void Bsuite() 
	{ 	
		System.out.println("--------------------------------------------------------------");
		System.out.println("Before Suite - executed only once before any of the tests in the entire test suite<TestNG> executed");
		
	}
}
