package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.Properties;

public class FileUtils {

    public org.json.simple.JSONObject getFileContentsAsJSONObject(String filepath) throws IOException, ParseException {
        Object objToParse;
        objToParse = new JSONParser().parse(new FileReader(filepath));
        JSONObject jo = (org.json.simple.JSONObject) objToParse;
        return jo;

    }

    public String getPropertyValueFromFile(String filePath, String property) throws IOException {
        Properties propObj = new Properties();
        FileInputStream propFile = new FileInputStream(filePath);
        propObj.load(propFile);
        String propertyValue = propObj.getProperty(property);
        return propertyValue;

    }

    public void setPropertyValue(String filePath, String property, String value) throws IOException {
        Properties propObj = new Properties();
        propObj.setProperty(property, value);
        FileOutputStream propFile = new FileOutputStream(filePath);
        propObj.store(propFile, "Properties modified");
    }
}
