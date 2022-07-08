package test_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_package.Homepage_class;
import pom_package.Login_page;

public class Testing_class {

	public static void main(String[] args) {
         
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Login_page pc = new Login_page(driver);
		pc.VerifyUsernameField();
		pc.sendusername();
		pc.sendpassword();
		pc.clicklogin();
		
//		Homepage_class hc = new Homepage_class(driver);
//		hc.ValidateOrangeHrmImg();
//		hc.ValidateAdminTab();
//		hc.ValidatePIMTab();
//		hc.ValidatePerformanceTab();
//		hc.clickonAvtarTab();
//		hc.clickonLogoutTab();
//		
//		
	}

}
