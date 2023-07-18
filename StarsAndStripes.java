/*
Miles Robertson
9-15-16
Period 6
Used to learn how to write a class and to write methods for that class
*/

import java.util.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
   
      System.out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
      System.out.println("********************");
   } 
   
   
   public void printTop5()
   {
      System.out.println("**********----------");
   }
    
   public void printTwentyDashes()
   {
      System.out.println("--------------------");
   }
   
   public void printTwoBlankLines()
   {
      System.out.println("");
      System.out.println("");
   }
   
   public void printASmallBox()
   { 
   printTwentyDashes();
   printTwentyStars();
   printTwentyDashes();
   printTwentyStars();
   printTwentyDashes();
   printTwentyStars();
   printTwentyDashes();
   }
 
   public void printABigBox()
   { 
   printASmallBox();
   printASmallBox();
   }

   public void printflag()
   {
   printTop5();
   printTop5();
   printTop5();
   printTop5();
   printTop5();
   printTwentyDashes();
   printTwentyDashes();
   printTwentyDashes();
   printTwentyDashes();
   printTwentyDashes();
   printTwentyDashes();
   printTwentyDashes();
   printTwentyDashes();
   }

}
