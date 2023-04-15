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
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;

/**
 *
 * @author vanting
 */
public class TestFlowLayout extends JFrame {

    public TestFlowLayout() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        JButton jbt = new JButton("I am a Button");
        jbt.setPreferredSize(new Dimension(100, 100));
        add(jbt);
    }

    /** Main method */
    public static void main(String[] args) {
        TestFlowLayout frame = new TestFlowLayout();
        frame.setTitle("TestFlowLayout");
        frame.setLocationRelativeTo(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
