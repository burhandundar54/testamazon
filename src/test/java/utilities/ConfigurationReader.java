package utilities;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class ConfigurationReader {
    // This class is used to reach properties file - test data
    // The data is stored in configuration.properties file
    private static Properties properties;
    static {
        // path of config file
        String path = "configuration.properties";
        try {
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
    // browser = chrome
//    @Test
//    public void test1(){
//        System.out.println("getProperty(\"browser\") = " + getProperty("browser"));
//        System.out.println("getProperty(\"google_url\") = " + getProperty("google_url"));
//    }
}