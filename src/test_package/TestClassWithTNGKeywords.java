package test_package;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestClassWithTNGKeywords {

			@BeforeClass
			public void beforeClass() {
				System.out.println("Before Class");
			}
			
			@BeforeMethod
			public void beforeMethod() {
				System.out.println("Before Method");
			}
			
			@Test (dependsOnMethods= {"test3", "test2"})
			public void test1() {
				System.out.println("Test1");
			}
			
			@Test (priority=2, invocationCount=3)
			public void test2() {
				System.out.println("Test2");
			}
			
			@Test (priority=1)
			public void test3() {
				//Assert.fail(); // here directly this 'test3' mwthod will get failed
				System.out.println("Test3");
				Assert.fail();   //here once it will get executed and then get failed due to "Assert.fail()"
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
	


