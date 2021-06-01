package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RestAPI {

	
	@Test
	public void Rest_API() {
		System.out.println("API");
		System.out.println("Launch_Browser");
		String curr_dir= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", curr_dir+"\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.close();
		
	}
	
	
}
