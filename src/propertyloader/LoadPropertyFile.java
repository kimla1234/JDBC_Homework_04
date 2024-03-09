package propertyloader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class LoadPropertyFile {
    public static final Properties properties = new Properties();
    public static void loadingProperties(){
        try (BufferedReader reader = new BufferedReader(new FileReader("application.properties"))){
            properties.load(reader);
        }catch (Exception exception){
            System.out.println("Problem during loading properties: " + exception.getMessage());
        }
    }
}