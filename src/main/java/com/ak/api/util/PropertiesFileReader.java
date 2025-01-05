package com.ak.api.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {

    private static Properties properties = new Properties();

    public static String getProperty(String fileName, String propertyName){
        String projectDir = System.getProperty("user.dir")+"/src/test/resources/";
        String filePath = projectDir+fileName;
        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.get(propertyName).toString();
    }



}
