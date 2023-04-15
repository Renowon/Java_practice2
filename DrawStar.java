/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EE3206_test2_prep;

/**
 *
 * @author Renn
 */


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawStar extends JFrame {

    public DrawStar() {
        setTitle("DrawPolygon");
        add(new PolygonsPanel());
    }

    /**
     * Main method
     */
    public static void main(String[] args) {
        DrawStar frame = new DrawStar();
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    class PolygonsPanel extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int xCenter = getWidth() / 2;
            int yCenter = getHeight() / 2;
            int radius = Math.min(getWidth(), getHeight());
            int longArm = (int) (radius * 0.4);
            int shortArm = (int) (radius * 0.3);
            int trough = (int) (radius * 0.15);
            
            int[] arms = {longArm , trough, shortArm, trough};
            int nPoints = 16;
            
            Polygon polygon = new Polygon();

            for (int i = 0; i < nPoints; i++) {
                double angle = i * ((2 * Math.PI) / nPoints);
                double x = xCenter + Math.cos(angle) * arms[i % 4];
                double y = yCenter - Math.sin(angle) * arms[i % 4];
                polygon.addPoint((int)x, (int)y);
            }

            g.setColor(Color.RED);
            g.fillPolygon(polygon);
        }
    }
}
