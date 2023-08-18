package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Radiobutton extends IVGT
{
	@BeforeClass
	public void init() throws InterruptedException {
		openBrowser();
	}
	@Test(priority=3)
public void Box() throws InterruptedException 
{
	
	WebElement radiobutton = driver.findElement(By.xpath("//input[@id='radio2']"));
	   radiobutton.click();
	   Thread.sleep(2000);
}
@AfterClass
public void Close()
{
	driver.close();
}	
}