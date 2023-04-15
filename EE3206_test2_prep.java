/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EE3206_test2_prep;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/** The hasNext() method returns true if there are more tokens from input
 * To read one character at a time, set the delimiter pattern to the empty string
 *  sc.useDelimiter("");
 *  Now each call to next returns a string consisting of a single character
 * @author Renn
 */
public class EE3206_test2_prep {

    /**
     * @param args the command li   ne arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = JOptionPane.showInputDialog("Enter the input");
        String string = s;
                
        Scanner scanner = new Scanner(string);
        scanner.useDelimiter("Woo");
        while(scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        
        
        
        
    }    
}
