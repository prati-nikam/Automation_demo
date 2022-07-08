package pom_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_page {
      
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement login;
	
	
	public Login_page(WebDriver driver1)
	{
		this.driver = driver1;

		PageFactory.initElements(driver1, this);
		 wait = new WebDriverWait(driver1, Duration.ofSeconds(20));
		
	}
	

	public void VerifyUsernameField()
	{
		boolean s =username.isDisplayed();
		System.out.println("username tab is visible" + s);
	}
	
	
	public void sendusername()
	{
		username.sendKeys("Admin");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtUsername']"))); 
	}
	
	public void sendpassword()
	{
		password.sendKeys("admin123");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtPassword']"))); 

	}
	
	public void clicklogin()
	{
		login.click();
	}
	
	
	
	
	
	
	
}
