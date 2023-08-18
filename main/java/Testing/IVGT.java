package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IVGT {

	protected static WebDriver driver;

	public static WebDriver openBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\payal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		Thread.sleep(1000);

	    driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/");
		Thread.sleep(1000);

		driver.manage().window().maximize();
		return driver;
		
		}

}
