import java.awt.*;
public class StickFigure //class
{
   private int baseX;
   private int baseY;
   private Color color;
   private int height;
   public StickFigure (int center, int bottom, Color shade, int size)
   {
      baseX = center;
      baseY = bottom;
      color = shade;
      height = size;
   }
   public void draw (Graphics page)
   {
      int top = baseY - height;
      page.setColor (color);
      page.drawOval (baseX-10, top, 20, 20);//x pos,y pos,width,height
      page.drawLine (baseX, top+20, baseX, baseY-30);
      page.drawLine (baseX, baseY-30, baseX-15, baseY);
      page.drawLine (baseX, baseY-30, baseX+15, baseY);
      page.drawLine (baseX, baseY-70, baseX-25, baseY-70);
      page.drawLine (baseX, baseY-70, baseX+20, baseY-85);//x1,y1,x2,y2
   //own code starts here
      page.setColor (color);
      page.drawOval (baseX-10, top+220, 20, 20);//head
      page.drawLine (baseX, top+220, baseX, baseY+30);//body
      page.drawLine (baseX, baseY+30, baseX+15, baseY);//leg 1
      page.drawLine (baseX, baseY+30, baseX-15, baseY);//leg 2
      page.drawLine (baseX, baseY+70, baseX+25, baseY+70);//flat arm
      page.drawLine (baseX, baseY+70, baseX-20, baseY+85);//bent arm
   
   }
}