/*
Miles Robertson
10-7-16
Per 6
Add two variables together
*/

import java.util.*;

class Sum
{
   private double one, two, x, sum;
   public void setNums(double num1, double num2)
   {
     // one=num1;
     // two=num2;
      one = keyboard.nextDouble(); 
      two = keyboard.nextDouble();
      
   }
   public void sum( )
   {
      sum = one + two;
   }
   public void print( )
   {
      while(x<sum)
      {
         x = x+1;
         if (sum%1==0)
         {
         System.out.println((int)sum);
         }
         else
         {
         System.out.println(sum);
         }
      }
   }
}