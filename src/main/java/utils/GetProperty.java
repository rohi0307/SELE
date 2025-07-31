package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetProperty {
    public static Properties prop;
    static{
        try {
            FileInputStream file=new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/TestData.properties");
            prop=new Properties();
            prop.load(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}
