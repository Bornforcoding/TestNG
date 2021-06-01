package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumJava {

	@Test
	public void Selenium_Java() {
		System.out.println("Selenium Java");
		System.out.println("Launch_Browser");
		String curr_dir= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", curr_dir+"\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sing-myworkspace.rbcvpn.com/vpn/index.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.close();
		
	}
}
