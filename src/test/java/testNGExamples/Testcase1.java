package testNGExamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 extends BaseClass{
	@Test
	//@Test(priority=0,description="This case will handle personal loan feature",groups= {"Sanity"})
	//@Test(groups={"Sanity"})
	//@Test
	public void LoanTest() {	
		System.out.println("Inside Loan Test");			
	}
	@Test(dependsOnMethods="LoanTest")
	//@Test(priority=2)
	public void LoanTest1() {	
		System.out.println("Inside Loan Test1");			
	}
	
	@Test(dependsOnMethods="LoanTest1")
	//@Test(enabled=false)
	//@Test(priority=1)
	public void CreditCardTest()
	{
		System.out.println("Inside Credit Card Test");
	}
	
	
}
