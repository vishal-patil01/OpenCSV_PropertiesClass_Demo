package propertiesclassdemo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesClassReadDataFromFile {
    //Read Data From Properties File
    private static void readFromFile() throws IOException {
        FileReader reader = new FileReader("PropertiesFiles/db.properties");

        Properties p = new Properties();
        p.load(reader);

        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"));

    }
    //Read Data From System Properties
    private static void readFromSystemProperties() {
        Properties p = System.getProperties();
        Set set = p.entrySet();

        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
    public static void main(String[] args) throws IOException {
        readFromFile();
        readFromSystemProperties();
    }
}
