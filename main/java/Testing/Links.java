package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Links extends IVGT {

	@BeforeClass
	public void init() throws InterruptedException {
		openBrowser();
	}

	@Test
	public void L1() throws InterruptedException {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		try {
			for (int j = 0; j < links.size(); j++) {
				System.out.println("Inside For loop " + links.get(j).getText());
				if (j >= 1 && j < 2) {
					System.out.println("Inside For loop " + links.get(j).getText());
					links.get(j).click();
					Thread.sleep(2000);
					driver.navigate().back();
					Thread.sleep(2000);
					links = driver.findElements(By.tagName("a"));
				}
			}
		} catch (Exception ex) {
			System.out.println("Inside Catch Block");

		}

	}

}
