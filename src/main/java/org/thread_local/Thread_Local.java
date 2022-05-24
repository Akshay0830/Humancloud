package org.thread_local;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Thread_Local {
//	private WebDriver driver;
		public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal <WebDriver>();
		public WebDriver initialize (String browserName) {
			
//			String path = System.getProperty("user.dir");
//			if(browserName.equals("chrome") || browserName.equalsIgnoreCase("ch")) {
//				System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
//				tlDriver.set(new ChromeDriver());
////				driver = new ChromeDriver();
//			} else if(browserName.equals("firefox") || browserName.equalsIgnoreCase("ff")) {
//				System.setProperty("webdriver.gecko.driver",path+"\\drivers\\geckodriver.exe");
//				tlDriver.set(new FirefoxDriver());
////				driver = new FirefoxDriver();
//			}
//			
			
			
			if(browserName.equals("chrome") || browserName.equalsIgnoreCase("ch")) {
				WebDriverManager.chromedriver().setup();
				tlDriver.set(new ChromeDriver());
//				driver = new ChromeDriver();
			}else if (browserName.equals("firefox") || browserName.equalsIgnoreCase("ff")){
				WebDriverManager.firefoxdriver().setup();
				tlDriver.set(new FirefoxDriver());
			}
			getDriver().manage().window().maximize();
//			
			return getDriver () ;
		}
		public static synchronized WebDriver getDriver () {
			return tlDriver.get();
		}
//	
	
	
		}
