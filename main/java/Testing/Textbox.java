package Testing;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Textbox extends IVGT
{
	
	@BeforeClass
	public void init() throws InterruptedException {
		openBrowser();
	}

	@Test
	public void Box() throws InterruptedException 
	{
	
//	WebElement e= driver.findElement(By.xpath("//input[@id='gparent_1'][1]"));
	
//	List<WebElement> element = driver.findElements(By.xpath(""));
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//nput[@id='parent_1'])[1]")).sendKeys("2");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@id='child_1'])[1]")).sendKeys("3");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@id='gparent_2'])[1]")).sendKeys("4");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@name='parent2'])[1]")).sendKeys("5");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@name='child2'])[1]")).sendKeys("6");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//input[@title='Enter You name'])[1]")).sendKeys("Payal");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//input[@class='s_name'])[1]")).sendKeys("Jain");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//input[@class='y_address'])[1]")).sendKeys("Pune");
	Thread.sleep(1000);
	}
	@AfterClass
	public void Close()
{
		driver.close();
}	
}
