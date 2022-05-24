package org.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public Properties init_prop ()  {
		Properties prop = new Properties();
		try {
	FileInputStream fis = new FileInputStream("./src/test/resources/org/properties/config.properties");
		prop.load(fis);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	
	}
}
