package org.properties;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtil {
	public static PropertiesUtil pl = new PropertiesUtil(); 
	public String getTestdata (String key)  {
		Properties pro = new Properties();
		try {
	FileInputStream fis = new FileInputStream("./src/test/resources/org/properties/config.properties");
		pro.load(fis);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return pro.getProperty(key);
	
	}
}
