/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EE3206_test2_prep;

import java.io.*;
import java.util.Date;

/**
 *
 * @author Renn
 */
public class TestObjectStreams {
    
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));
        
        // write a string, double value, amnd object to the file
        output.writeUTF("John");
        output.writeDouble(85.5);
        output.writeObject(new Date());
        
        // close output stream
        output.close();
        
        // create an input stream for file object.dat
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"));
        
        // Read a string, double value, and object from the file
        String name = input.readUTF();
        double score = input.readDouble();
        Date date = (Date)(input.readObject());
        
        System.out.println(name + " " + score + " " + date);
        
        // close intput stream
        input.close();
    }
}
