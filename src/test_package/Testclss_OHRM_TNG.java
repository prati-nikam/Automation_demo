package test_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_package.Homepage_class;
import pom_package.Login_page;

public class Testclss_OHRM_TNG {

	  WebDriver driver;
	  
	  @BeforeClass
	  public void beforeclass()
	  {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");	
	        driver = new ChromeDriver();	
        	driver.manage().window().maximize();
        	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	  }
	  
	  @BeforeMethod
	  public void Login()
	  {
		     
		  Login_page login = new Login_page(driver);
		  login.sendusername();
		  login.sendpassword();
		  login.clicklogin();
	  
	  }
	  
	  
	  @Test
	  public void ValidateHomePage()
	  {
			Homepage_class home = new Homepage_class(driver);
               home.ValidateAdminTab();
               home.ValidatePIMTab();
	  }
	  
	  @AfterMethod
	  public void aftermethod()
	  {
			Homepage_class home = new Homepage_class(driver);
            home.clickonAvtarTab();
            home.clickonLogoutTab();
	  }
	  
	  @AfterClass
	  public void afterclass()
	  {
		  driver.quit();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

}
