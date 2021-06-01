package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Appium {

	
	@Test
	public void AppiUM() {
		System.out.println("Appium");
		System.out.println("Launch_Browser");
		String curr_dir= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", curr_dir+"\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/feed/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
	}
}
