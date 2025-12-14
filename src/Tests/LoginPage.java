package Tests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class LoginPage 
{
	
	@AfterClass
	public void AClass()
	{
		System.out.println("AfterClass - will be executed only once after all the test methods within the current class <LoginPage> have completed their execution.");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
	}
	
	@BeforeTest
	public void BeTest() {
		System.out.println("BeforeTest - Executed only once before all test methods in this particular class file");
		System.out.println();
	}
	
	@Test (groups={"Smoke"})
	public void TestCase4()
	{
		System.out.println("TestCase4 Executed - User Logged in Successfully ! ");
	}
	
	@BeforeClass
	public void BClass()
	{
		System.out.println("BeforeClass - It runs only once, before the FIRST @Test method in this particular 'LoginPage' class file is executed.");
		System.out.println();
	}
	
	@Test
	public void TestCase5()
	{ 	
		System.out.println("TestCase5 Executed - User Signed Up Successfully !");
	}
	
	@BeforeMethod
	public void BmMethod() 
	{ 	
		System.out.println("BeforeMethod - A method will run before every @Test method present ONLY in this particular 'LoginPage' class file.");
	}
	
	@Test(timeOut=4000) 
	public void TestCase6() 
	{ 	
		System.out.println("TestCase6 Executed - User Logged Out Successfully !");
		System.out.println("--------------------------------------------------------------");
	}	
	
	
}
