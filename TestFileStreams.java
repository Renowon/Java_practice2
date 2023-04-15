/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EE3206_test2_prep;

import java.io.*;

/**
 *
 * output
 * 1 2 3 4 5 6 7 8 9 10
 * @author Renn
 */
public class TestFileStreams {

    public static void main(String[] args) throws IOException {
        // Create an output stream to the file
        FileOutputStream output = new FileOutputStream("temp.dat");

        // Output values to the file
        for (int i = 1; i <= 10; i++) {
            output.write(i);
        }

        // Close an input streamfor the file
        FileInputStream input = new FileInputStream("temp.dat");

        // Read values from the file
        int value;
        while ((value = input.read()) != -1) {
            System.out.print(value + " ");
        }
        
        // Close the input stream
        input.close();
    }
    

}


