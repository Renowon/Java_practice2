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
import java.awt.Graphics;

public class TestGetGraphics extends JFrame {

    private JLabel jlblBanner = new JLabel("Banner");

    public TestGetGraphics() {
        add(jlblBanner);
        //System.out.println(jlblBanner.getGraphics());
    }

    public static void main(String[] args) {
        TestGetGraphics frame = new TestGetGraphics();
        frame.setTitle("TestGetGraphics");
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.setVisible(true);
        
        // suspending here until pressing enter to return
        JOptionPane.showMessageDialog(null, "Delay on purpose\nClick OK to dismiss the dialog");
        
        Graphics graphics = frame.jlblBanner.getGraphics();
        graphics.drawLine(0, 0, 150, 150);
        

        
    }
}
