/*
Miles Robertson
10-13-16
Per 6
Calculate a rectangles perimeter using variables.
*/

public class Rectangle
{
   private int length;
   private int width;
   private int perimeter;
   
   public void Directions()
   {
      System.out.println("Enter the width, and then height: ");
      System.out.println("");
   }
   
   public void setLengthWidth(int len, int wid )
   {
      length=len;
      width=wid;
   }
   public void calculatePerimeter( )
   {
      perimeter= 2*length + 2*width;
   }
   public void print( )
   {
      System.out.println("Your perimeter is: " + perimeter);
   }
   
   public void space( )
   {
      System.out.println("");
   }
   
   public void r( )
   {
      for(int i=1; i <= length; i++)
      {
         System.out.print("-");
      }
   }   
      
   public void s( )
   {   
      System.out.println("");
      for(int j=1; j <= width; j++)
      {
         System.out.print("|");
         for(int k=3; k <= length; k++)
         {
            System.out.print(" ");
         }
         System.out.println("|");
      }
   }
}