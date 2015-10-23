package ru.ncedu.istratenko.CC;


import java.io.*;
import java.util.*;

/**
 * Created by denis on 12.10.15.
 */

/**
 * Responsible for obtaining the path to a class that is responsible
 * for processing introduced arifmiticheskoy operations / functions
 * @author Denis Istratenko
 */
public class ConfigurationSign {

    private static Properties prop=new Properties();
    private static File file= new File("src/ru/ncedu/istratenko/CC/resources/Config.properties");


    private  void loadProperties(){
        try {
            prop.load(new FileReader(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Displays all available for the calculator operation from the configuration file
     */
    public void availableOperations(){
    try {
           loadProperties();
            System.out.println(prop.stringPropertyNames());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *It gets the full name of the class that is responsible
     * for processing the entered arithmetic sign / function</br>
     * @param sign arithmetic sign or function is entered from the keyboard
     * @return string path, which handles an arithmetic operation
     */
    public   String getClassNameBySign(String sign){
        loadProperties();
        return prop.getProperty(sign);
    }


}



