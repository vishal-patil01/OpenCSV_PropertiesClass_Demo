package propertiesclassdemo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClassWriteDataToFile {

    public static void main(String[] args) throws IOException {
        Properties p=new Properties();
        p.setProperty("name","Sonoo Jaiswal");
        p.setProperty("email","sonoojaiswal@javatpoint.com");

        p.store(new FileWriter("PropertiesFilesGenerated/info.properties"),"Javatpoint Properties Example");

    }
}
