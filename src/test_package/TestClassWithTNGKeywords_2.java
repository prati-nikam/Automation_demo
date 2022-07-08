package test_package;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassWithTNGKeywords_2 {

	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@Test (priority=2) 
	public void test1() {                          
		System.out.println("Test1");
	}
	
	@Test (priority=1)
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test (timeOut=2000)
	public void test3() throws InterruptedException {
		System.out.println("Test3");
        Thread.sleep(3000);		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
}




/* @Test (invocationCount=2)
	public void test2() {
		System.out.println("Test2");
	}  ==>this vel show that how many times you want to run that specific test script
	   ==> defaultly invocation count is 1 ==>karan test case ekda tari run kartoy ch aapn
	
	@Test (priority=1)
	public void test3() {
		System.out.println("Test3");
		
	}   ==> likewise we can set the priority to test cases  if the lowerst the priority no this test case will be execute firtyly
	    ==> default priority is set as 0  ==> number line follow karaychi
	    
	 @Test (priority=2, invocationCount=2)   ==>tumhi don eksath taku shakata
	public void test2() {                    ==>fact invocation count negative madhe kiva 0 nahi takaycha jas priority la deu shakat hoto
		System.out.println("Test2");
	}
	    
	    **depends on method==>jar konata test case dusry test case var depend asel tya thikani
	    @Test (dependsOnMethods = {"test3"}) // passing method name as a string
	public void test1() {                     //depend add kelyamule tyachi prio -1 hote jyachyav depend ahe tyacha nantr print karte
		System.out.println("Test1");
	}
	
	**@Test (dependsOnMethods = {"test3" , "test2"}) // methods var pan priority lau shakat he pan diff behave karel 
	public void test1() {                            // run 1==>test3  ==>test2==>test 1  (test1 chi priority 0 hoti)
		System.out.println("Test1");
	}
	
	@Test (priority=2)
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test (priority=1)
	public void test3() {
		System.out.println("Test3");
		
		
		
		**********Assert*************
		*@Test (dependsOnMethods = {"test3" , "test2"}) 
	public void test1() {                          //hya case madhe hi method nahi run honar karan hi jyachyav depend aahe tyatl ek fail jhalay
		System.out.println("Test1");
	}
	
	@Test (priority=2)
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test (priority=1)
	public void test3() {
		System.out.println("Test3");
		Assert.fail();                    //jar assert keyword aapn test 3 chya printing statemet chya adh ilihal asat tar test 3 vali method run ch nasati jhali
		}                                  // karan te adhich fail hotay
		
	
	************************************************************************
	@Test (enabled=false)     //if we dont want to run the specific test case because some reason like its breaking the functionality
	public void test1() {                  // or there is some defect which is not solved yet thats why         
		System.out.println("Test1");     // if it is enabled false then it is not the part of the execution
	}
******************************************************************************************	
	
	@Test (timeOut=2000)
	public void test3() throws InterruptedException {        //if we provide the specific time period for the test case 
		System.out.println("Test3");                         //if we know that any specific test case is taking too much time then to so we use that
        Thread.sleep(3000);		                            // this will show threadtimeoutexception exception
	}
	
	

	
	    */
