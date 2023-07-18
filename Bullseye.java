/*
Miles Robertson
10-25-16
Per 6
Extra Credit, creates a bulls eye
*/

import java.applet.Applet;
import java.awt.*;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Bullseye extends Applet 
{
   public void paint (Graphics page)
   {
      final int MAX_WIDTH = 300,NUM_RINGS = 5, RING_WIDTH = 25;
      int x = 0, y = 0, diameter;
      setBackground (Color.yellow);
      diameter = MAX_WIDTH; 
      page.setColor (Color.white);
      for (int count = 0; count < NUM_RINGS; count++)
      {
         if (page.getColor() == Color.black)
            page.setColor (Color.white);
         else 
            page.setColor (Color.black);
         page.fillOval (x, y, diameter, diameter);
         diameter -= (2 * RING_WIDTH);
         x += RING_WIDTH;
         y += RING_WIDTH;
      }
      page.setColor (Color.red);
      page.fillOval (x, y, diameter, diameter);
      
      
      //new own code
      //page.fillOval (x position, y position, x size, y size);
      
      //System.out.println(x);
      //System.out.println(y);
      
      page.setColor (Color.green);
      page.fillOval (144, 150, 10, 175);
      page.setColor (Color.orange);
      page.fillRoundRect(150, 275, 70, 60, 25, 25);
      page.setColor (Color.magenta);
      page.fillRoundRect(80, 275, 70, 60, 25, 25);
   }
}