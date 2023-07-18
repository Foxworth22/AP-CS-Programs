/*
Miles Robertson
9-16-16
Per 6
Use runner for BigHouse
*/


import javax.swing.JFrame;
import java.awt.Component;
import java.awt.event.ActionEvent;
//import java.awt.*;
//import javax.swing.*;

//import static java.lang.System.*;

public class BigHouseRunner extends JFrame
{

   private static final int WIDTH = 800;
   private static final int HEIGHT = 600;
  
   public BigHouseRunner()
   {
      super("CREATE YOUR OWN SHAPE");
      setSize(WIDTH,HEIGHT);
   
      getContentPane().add(new BigHouse());
   
   //add other classes to test them
   //ADD BigHouse
   
      setVisible(true);
   
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public static void main(String args[])
   {
   
      BigHouseRunner run = new BigHouseRunner();
   
      BigHouse test = new BigHouse();
   
   //test.paint(Graphics window);
   //test.bigHouse(Graphics window);
   
   }
}
