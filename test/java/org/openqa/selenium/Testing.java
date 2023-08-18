package org.openqa.selenium;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Beforetest
public class Testing
{
	WebDriver driver;
  	@Test(priority = 0)
	@BeforeMethod
	public void navigate() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\payal\\chromedriver_win32 (1)\\chromedriver.exe");
		driver.navigate().to("https://www.google.com/");
		//driver.findElement(By.id(""));
	}
	@Test(priority = 1)
	public void orangehrmlive() 
	{
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");  
		//Assert.assertFalse(true);  
	//	Thread.sleep(3000); 
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).click();
		
		driver.findElement(By.name("Username")).sendKeys("Admin");
		//Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys("admin123");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	//	driver.findElement(By.name("Password")).sendKeys(Keys.ENTER);
			
		//driver.findElement(By.xpath("(//input[@type='search']/following::button)[1]")).click();
	//	Thread.sleep(3000);
	}
	
	@Test
	public void Sublink() 
	{
	driver.findElement(By.xpath("//span[@class=oxd-userdropdown-tab']")).click();
	String ExpectedTitle = "JubLEdMXzS Collings";
	String ActualTitle = driver.getTitle();
	//WebElement e = driver.findElement(By.xpath("//span[@id=\'2009–present:_Commercial_success'"));
			
    Assert.assertEquals(ExpectedTitle, ActualTitle);
		
	
	   driver.close();
	}
}
