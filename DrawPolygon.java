/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EE3206_test2_prep;

/**
 *
 * @author Renn
 */
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawPolygon extends JFrame {

    public DrawPolygon() {
        setTitle("DrawPolygon");
        add(new PolygonsPanel());
    }

    /**
     * Main method
     */
    public static void main(String[] args) {
        DrawPolygon frame = new DrawPolygon();
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 250);
        frame.setVisible(true);
    }

    class PolygonsPanel extends JPanel {

        /*
         * Draw a hexagon with a center point and a radius
         */
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Calculate the center and radius of the hexagon
            int xCenter = getWidth() / 2;
            int yCenter = getHeight() / 2;
            int radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);

            // Create a Polygon object
            Polygon polygon = new Polygon();

            // Add points to the polygon to form a hexagon
            polygon.addPoint(xCenter + radius, yCenter);
            polygon.addPoint((int) (xCenter + radius * Math.cos(2 * Math.PI / 6)), (int) (yCenter - radius * Math.sin(2 * Math.PI / 6)));
            polygon.addPoint((int) (xCenter + radius * Math.cos(2 * 2 * Math.PI / 6)), (int) (yCenter - radius * Math.sin(2 * 2 * Math.PI / 6)));
            polygon.addPoint((int) (xCenter + radius * Math.cos(3 * 2 * Math.PI / 6)), (int) (yCenter - radius * Math.sin(3 * 2 * Math.PI / 6)));
            polygon.addPoint((int) (xCenter + radius * Math.cos(4 * 2 * Math.PI / 6)), (int) (yCenter - radius * Math.sin(4 * 2 * Math.PI / 6)));
            polygon.addPoint((int) (xCenter + radius * Math.cos(5 * 2 * Math.PI / 6)), (int) (yCenter - radius * Math.sin(5 * 2 * Math.PI / 6)));

            // Draw the hexagon using the polygon
            g.drawPolygon(polygon);
        }
    }
}