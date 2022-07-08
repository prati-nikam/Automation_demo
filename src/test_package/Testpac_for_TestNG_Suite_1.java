package test_package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testpac_for_TestNG_Suite_1 {

	@BeforeClass
	public void beforeclass2 ()
	{
		System.out.println("this is thew annotation of second class = before class 2");
	}
	
	
	@BeforeMethod
	public void beforeMethod2 ()
	{
		System.out.println("this is the annotation of second class = before method");
	}
	
	
	@Test(priority=2)
	public void test1 ()
	{
		System.out.println("this is the annotation of second class = test annotation 2");
	}
	
	@Test(priority=1)
	public void test2 ()
	{
		System.out.println("this is the annotation of second class = test annotation 2");
	}
	
	@AfterMethod
	public void aftermethod1 ()
	{
		System.out.println("this is the annotation of second class = after method annotaiton 2");
	}
	
	@AfterClass
	public void afterclass ()
	{
		System.out.println("this is the annotation of second class = after class annotaiton 2");
	}
	
	
	
	
	
	
}
