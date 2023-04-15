/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EE3206_test2_prep;

/**
 *
 * @author Renn
 */
import java.awt.GraphicsEnvironment;

/**
 *
 * @author vanting
 */
public class AvailableFonts {

    public static void main(String[] args) {
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();

        String[] fontnames = e.getAvailableFontFamilyNames();
        for (int i = 0; i < fontnames.length; i++) {
            System.out.println(fontnames[i]);
        }

    }
}
