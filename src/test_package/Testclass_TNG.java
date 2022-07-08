package test_package;

//it does not follows the sequence
//it has defined sequence it follows that for ex= before class== before method== test == after method ==after class

import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testclass_TNG {
        
	@BeforeClass
	public void beforeclass()   //whenever we run prog this annotation runs first
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforemethod() //test case chya aadhi jar konate prerequirement nasel tar you can**skip ** it
	{
		System.out.println("before method");
	}
	
	@Test
	public void testclass2()   //testclass1 , testclass2 they are the name of test cases
	{	
		System.out.println("test 2");
	}
	
	@Test
	public void validate()   //before method ==>test ==>after method  // ha flow follow hoto// test1 , test2 hya number of test cases aahet
	{	
		System.out.println("validate 1");
	}
	
	@Test
	public void testclass3()   //our actual test cases will be in test annotation //pratek test case run honyaaadhi before method annotaiton run hote
	{	
		System.out.println("test 3");
	}

	//test jya sequence ni lihle tasa run nahi hota te alphabetical order follow karate  //***numbers ne method name start nahi hota***
	
	@AfterMethod()
	public void aftermethod()
	{
		System.out.println("after method");
	} 
	
	@AfterClass()
	public void afterclass()           //whenever prog ends this annotaion runs
	{
		System.out.println("after class");
	}
	
	
	/*these things will get shown in op
	 * PASSED: testclass2  //name of that method that is name of the test case
PASSED: testclass3
PASSED: testclass1

===============================================
    Default test
    Tests run: 3, Failures: 0, Skips: 0
===============================================
aplyala readymade report milato ki kiti test case run ,fail jhalya so we use

===============================================
Default suite
Total tests run: 3, Passes: 3, Failures: 0, Skips: 0
========================== 

for example login functinality check kartoy tyaveli 
1. diff test data asato 
2. log in karun logout karne asa repeated task asato aplyala 
log in ==> before method madhe lihu
log out ==> after method madhe lihu
*/
}
