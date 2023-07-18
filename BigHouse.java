/*
Miles Robertson
9/22/16
Per 6
Big House To draw and fill shapes
*/

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{

   public BigHouse() 
   {
   
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   
   }

   public void paint( Graphics window )
   {
      bigHouse(window);
   
   }

   public void bigHouse( Graphics window )
   {
   /*window.setColor(Color.BLUE);
   window.drawString ("BIG HOUSE", 50, 50 );
   window.setColor(Color.BLUE);
   window.fillRect( 200, 200, 400, 400 );
   */
   
   window.setColor(Color.magenta);
   window.drawString( "BIG HOUSE ",370, 50);
   window.setColor(Color.BLUE);
   window.fillRect(200, 200, 400, 400 );
   window.setColor(Color.WHITE);
   window.fillRect( 350, 410, 100, 170 );
   window.setColor(Color.YELLOW);
   window.fillRect( 250, 250, 80, 80 );
   window.setColor(Color.YELLOW);
   window.fillRect( 470, 250, 80, 80 );
   
   window.setColor(Color.red);
   window.fillRect( 160, 180, 480, 40 );
   
   window.setColor(Color.orange);
   //window.fillRect( 160, 180, 480, 40 );
   //(x position, y position, x dimension, y dimension)
   }
}