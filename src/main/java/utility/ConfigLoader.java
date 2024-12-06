package utility;

import org.testng.Reporter;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Properties;
public class ConfigLoader {
    Properties properties;
    public ConfigLoader(){
        try {
            //config = new Properties();
            String filePath =System.getProperty("user.dir") + "//src//test//resources//configuration//config.properties";
            File f = new File(filePath);
            if(f.exists() && !f.isDirectory()) {
                FileInputStream fileStream = new FileInputStream(filePath);
                properties=new Properties();
                properties.load(fileStream);
                Reporter.log("Properties file loaded successfully");
            }
            else
            {
                Reporter.log("Config  file not exists");
            }

        }
        catch (Exception e){
            Reporter.log("Configuration Properties file not found." + Arrays.toString(e.getStackTrace()));
        }

    }

    public String Get(String key)
    {
        return properties.getProperty(key);

    }
}
