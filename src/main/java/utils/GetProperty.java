package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetProperty {
	public static Properties prop;

	static {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream(
					"C:\\Users\\rohi4\\Ghost\\SwagLabs\\src\\test\\resources\\TestData.properties");
			prop.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
