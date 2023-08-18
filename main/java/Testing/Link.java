package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Link extends IVGT {

	@BeforeClass
	public void init() throws InterruptedException {
		openBrowser();
	}

	@Test
	public void Box() throws InterruptedException {

		WebElement link = driver.findElement(By.xpath("//span[contains(text(), 'Visit MyTest Page')]"));
		link.click();
		Thread.sleep(5000);
	}

	@AfterClass
	public void Close() {
		driver.close();
	}
}