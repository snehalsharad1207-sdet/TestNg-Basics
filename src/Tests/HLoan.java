package Tests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class HLoan 
{
	
	@BeforeClass
	public void BClass()
	{
		System.out.println("BeforeClass - It runs only once, before the FIRST @Test method in this particular 'HLoan' class file is executed.");
		System.out.println();
	}
	
	@Test (groups={"Smoke"})
	public void TestCase7()
	{
		System.out.println("TestCase7 Executed - Home Loan sanctioned Successfully !");
	}
	
	@Test(dataProvider="getData")
	public void TestCase8(String Uname , String Pass) 
	{ 	
		System.out.println("TestCase8 Executed - Amount Credited Successfully for " + Uname + "  with Password :" + Pass);
		
	}
	@Test(dependsOnMethods= {"TestCase7"})
	public void TestCase9() 
	{ 	
		System.out.println("EMI Paid Successfully !");
		System.out.println("--------------------------------------------------------------");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		// MultiDimensional Array with 3 rows 2 columns.
		
		Object[][] Data= new Object[3][2];
		//1st Row : uname,pw
		Data[0][0]="First User";
		Data[0][1]="123";
		
		//2nd Row : uname,pw
		Data[1][0]="Second User";
		Data[1][1]="456";
		
		//3rd Row : uname,pw
		Data[2][0]="Third User";
		Data[2][1]="789";
		
		return Data;
		
	}
}
