package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dropdown extends IVGT {

	@BeforeClass
	public void init() throws InterruptedException {
		openBrowser();
	}

	@Test
	public void Box() throws InterruptedException {

		WebElement d = driver.findElement(By.id("Carlist"));
		Select dropdown = new Select(d);
		dropdown.selectByIndex(3);
		
		Thread.sleep(3000);
	}

	@AfterClass
	public void Close() {
		driver.close();
	}
}
