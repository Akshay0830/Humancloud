package org.applicationHooks;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.properties.ConfigReader;
import org.thread_local.Thread_Local;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class flipkarthooks {
	private WebDriver driver;
	@Before
	public void browser_open() {
		ConfigReader cr = new ConfigReader();
		Properties prop = cr.init_prop();
		Thread_Local tl = new Thread_Local ();
		driver = tl.initialize(prop.getProperty("browserName"));
	}

	@After
	public void close_browser() {

	}

}
