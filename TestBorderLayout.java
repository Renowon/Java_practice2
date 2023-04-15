/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EE3206_test2_prep;

/**
 *
 * @author Renn
 */


import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;

/**
 *
 * @author vanting
 */
public class TestBorderLayout extends JFrame {

    public TestBorderLayout() {
        setLayout(new BorderLayout(5, 5));
        JButton jbt = new JButton("I am a Button");
        jbt.setPreferredSize(new Dimension(100, 100));
        add(jbt, BorderLayout.CENTER);
    }

    /** Main method */
    public static void main(String[] args) {
        TestBorderLayout frame = new TestBorderLayout();
        frame.setTitle("TestBorderLayout");
        frame.setLocationRelativeTo(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

