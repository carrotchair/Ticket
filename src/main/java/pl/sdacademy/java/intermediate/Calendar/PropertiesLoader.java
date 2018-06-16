package pl.sdacademy.java.intermediate.Calendar;

import java.io.IOException;
import java.util.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PropertiesLoader {

    public String getValue() {
        return value;
    }

    public String getValue2() {
        return value2;
    }

    public String getValue3() {
        return value3;
    }

    public String getValue4() {
        return value4;
    }

    private String value;
    private String value2;
    private String value3;
    private String value4;

    public PropertiesLoader() {

        try {
            File file = new File("src\\main\\resources\\calendar.properties");
            FileInputStream fileInputStream = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            //fileInputStream.close();

            value = properties.getProperty("path.event");
            value2 = properties.getProperty("path.todo");
            value3 = properties.getProperty("dateInput");
            value4 = properties.getProperty("dateOutput");

        //} catch (FileNotFoundException e) {
        //    e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
