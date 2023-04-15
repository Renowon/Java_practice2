/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EE3206_test2_prep;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Properties;

/**
 *
 * @author Renn
 */
public class FileLoader {

    /* 
    You must build your project first to transfer the target file to
    the build folder. Otherwise, you will get NullPointerException.
     */
    public static void main(String[] args) {
      
        new FileLoader().instanceLoad();
        
        staticLoad();
        
        staticLoadAsStream();

    }

    public void instanceLoad() {
        URL url = getClass().getResource("embedded-resource.properties");
        File file = new File(url.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println("");
    }

    public static void staticLoad() {
        URL url = FileLoader.class.getResource("embedded-resource.properties");
        File file = new File(url.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println("");
    }

    public static void staticLoadAsStream() {
        InputStream in = FileLoader.class.getResourceAsStream("embedded-resource.properties");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            // Alternatively, use a Properties object to load the key/value pairs
//            Properties properties = new Properties();
//            properties.load(in);
//            System.out.println(properties.getProperty("instructor"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        
    }

}
