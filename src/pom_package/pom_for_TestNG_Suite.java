package pom_package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class pom_for_TestNG_Suite {

	@BeforeClass
	public void beforeclass1 ()
	{
		System.out.println("this is thew annotation of first class = before class");
	}
	
	
	@BeforeMethod
	public void beforeMethod1 ()
	{
		System.out.println("this is the annotation of first class = before method");
	}
	
	
	@Test(priority=2)
	public void test1 ()
	{
		System.out.println("this is the annotation of first class = test annotation 1");
	}
	
	@Test(priority=1)
	public void test2 ()
	{
		System.out.println("this is the annotation of first class = test annotation 2");
	}
	
	@AfterMethod
	public void aftermethod1 ()
	{
		System.out.println("this is the annotation of first class = after method annotaiton");
	}
	
	@AfterClass
	public void afterclass ()
	{
		System.out.println("this is the annotation of first class = after class annotaiton");
	}
	
	
	
	
	
	
	
	
	
}
