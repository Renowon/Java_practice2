/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EE3206_test2_prep;

/**
 *
 * @author Renn
 */


import javax.swing.*;

public class MyFrameWithComponents {

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyFrameWithComponents");

        // Add a button into the frame
        JButton jbtOK = new JButton("--I AM VERY FAT--");
        frame.add(jbtOK);

        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // New since JDK 1.4
    }
}
