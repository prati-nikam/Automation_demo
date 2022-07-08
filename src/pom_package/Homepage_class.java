package pom_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage_class {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//img[@alt='OrangeHRM']")
	private WebElement OrangeHrmImg;
	
	@FindBy(xpath="//b[text()='Admin']")
	private WebElement AdminTab;

	@FindBy(xpath="//b[text()='PIM']")
	private WebElement PIM;

	@FindBy(xpath="//b[text()='Performance']")
	private WebElement PerformanceTab;
	
	@FindBy(xpath="//a[text()='Employee Trackers']")
	private WebElement EmployeeTracker;
	
	@FindBy(xpath="//a[@id='welcome']")
    private  WebElement Avtar;

	@FindBy(xpath="//a[text()='Logout']")
	private WebElement LogOut;

	
//===================Constructor============================================	
	   
	public Homepage_class(WebDriver driver2)
	{
		this.driver = driver2; // this. driver points out the globally declared webdriver driver and the =driver2 reprents to th argument passed in the constructor
		PageFactory.initElements(driver2, this);
		 wait = new WebDriverWait(driver2, Duration.ofSeconds(10));

	}
	
//===================methods for each functonality============================================	
	   public void ValidateOrangeHrmImg ()	
	    {
		  boolean result= OrangeHrmImg.isDisplayed();
		  System.out.println("orange hrm image is displyed" + result);
	    }
	   

	   public void ValidateAdminTab ()
	   {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='Admin']"))); 

		   Actions act = new Actions(driver);
		   act.moveToElement(AdminTab).click().build().perform();
		   driver.navigate().back();
	   }
	   
	   public void ValidatePIMTab ()
	   {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='PIM']"))); 

		  boolean p = PIM.isDisplayed();
		   System.out.println(p);
	   }
	   
	   public void ValidatePerformanceTab () 
	   {
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='Performance']"))); 

		   
		   Actions act = new Actions(driver);
		   act.moveToElement(PerformanceTab).moveToElement(EmployeeTracker).click().perform();
			driver.navigate().back();	 
			boolean p =PerformanceTab.isDisplayed();
			System.out.println("verify performancetab is displyed" +p);
	    }
	   
	   public void clickonAvtarTab ()
	   {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']"))); 
		
               Avtar.click();

	   }
	
	   public void clickonLogoutTab ()
	   {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']"))); 
		
               LogOut.click();

	   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
