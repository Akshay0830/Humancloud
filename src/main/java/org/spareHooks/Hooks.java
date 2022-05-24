package org.spareHooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	public static WebDriver driver;
	@Before
	public static void open_browser() {
		String url = "https://www.amazon.com/";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		
	}
		@After
		public static void Close_browser() {
//		driver.close();
			
		}
	

}

