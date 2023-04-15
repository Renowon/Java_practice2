/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EE3206_test2_prep;

/**
 *
 * @author Renn
 */

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author vanting
 */
public class TestGridLayout extends JFrame {

    public TestGridLayout() {
        setLayout(new GridLayout(1, 0, 5, 5));
        JButton jbt = new JButton("I am a Button");
        jbt.setPreferredSize(new Dimension(100, 100));
        add(jbt);
    }

    /** Main method */
    public static void main(String[] args) {
        TestGridLayout frame = new TestGridLayout();
        frame.setTitle("TestGridLayout");
        frame.setLocationRelativeTo(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
