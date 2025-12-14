package Tests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class PLoan {
	
	String url;
	
    @Test
    public void TestCase3() 
    {
        System.out.println("Test Case3 Executed");
    }
    
    @Parameters({"URL","API/Key"})
    @BeforeTest
    public void BTest(String url,String Key) 
    {
    		System.out.println();
        System.out.println("BeforeTest - Executed only once before all test methods in this 'PLoan' class file");
        System.out.println("URL value from PLoan File:" + url + "  API/Key is : " + Key);
        
    }
}
