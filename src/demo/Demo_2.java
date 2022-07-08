package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_2 {
	
	
	
//	@BeforeTest
//	public void beforetest2  ()
//	{
//		System.out.println("beforetest==>CLASS-->Demo_2");
//	}
	
	
	@BeforeClass
	public void beforeclass ()
	{
		System.out.println("beforeclass ==>CLASS-->Demo_2");
	}
	
	
	@BeforeMethod
	public void beforeMethod ()
	{
		System.out.println("beforemethod ==>CLASS-->Demo_2");
	}
	
	
	@Test
	public void test()
	{
		System.out.println("test ==>CLASS-->Demo_2");
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod ==>CLASS-->Demo_2");
	}
	
	@AfterClass
	public void afterclass ()
	{
		System.out.println("aftermethod ==>CLASS-->Demo_2");
	}
	
//	@AfterTest
//	public void aftertest2  ()
//	{
//		System.out.println("aftertest==>CLASS-->Demo_2");
//	}
//	
	

}
