package Testing;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Button extends IVGT
{


	@BeforeClass
	public void init() throws InterruptedException {
		openBrowser();
	}
	@Test
public void Box() throws InterruptedException 
{

driver.findElement(By.xpath("(//input[@name='fname'])[1]")).sendKeys("Inspirit");
Thread.sleep(1000);

driver.findElement(By.xpath("(//input[@name='lname'])[1]")).sendKeys("vision");
Thread.sleep(1000);

driver.findElement(By.xpath("(//input[@name='userid'])[1]")).sendKeys("abc");
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@name='pswrd'])[1]")).sendKeys("123");
Thread.sleep(1000);

driver.findElement(By.xpath("(//input[@type='reset'])")).click();
Thread.sleep(5000);
}
@AfterClass
public void Close()
{
	driver.close();
}	
}