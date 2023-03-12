package Utils;

import org.testcontainers.shaded.org.apache.commons.lang.StringUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesOperations {

    static Properties prop = new Properties();
    public static String getPropertyValueByKey(String key) throws Exception {
        String PropFilePath = System.getProperty("user.dir")+"/src/test/resources/data/config.properties";
        FileInputStream fis = new FileInputStream(PropFilePath);
        prop.load(fis);
        String value =prop.get(key).toString();

        if (StringUtils.isEmpty(value))
        {
            throw new Exception("Value is not Specified For Key"+key+"in properties file");
        }
        return value;
    }

    public static String getPropertyValueByKey(String fileName,String key) {

        String value = null;
        try {
            String PropFilePath = System.getProperty("user.dir") + "/src/test/resources/data/" + fileName + ".properties";
            FileInputStream fis = new FileInputStream(PropFilePath);
            prop.load(fis);
            value = prop.get(key).toString();
        }catch (Exception e){
            throw new RuntimeException("Error: "+e);
        }
        if (StringUtils.isEmpty(value))
        {
            throw new RuntimeException("Value is not Specified For Key"+key+"in properties file");
        }
        return value;
    }

}