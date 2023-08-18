package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


@Test
public class Checkbox extends IVGT
{


	@BeforeClass
	public void init() throws InterruptedException {
		openBrowser();
	}
	@Test(priority=2)
public void Box() throws InterruptedException 
{
	WebElement checkbox = driver.findElement(By.xpath("//input[@id='check1']"));
	   checkbox.click();
	   Thread.sleep(2000);
	   
	   WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='check2']"));
	   checkbox1.click();
	   Thread.sleep(2000);
	   
	   WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='check3']"));
	   checkbox2.click();
	   Thread.sleep(2000);
}
		@AfterClass
		public void Close()
	{
			driver.close();
	}	
}

