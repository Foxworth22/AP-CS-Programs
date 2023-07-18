import java.util.*;

//********************************************************************
//Miles Robertson
//Fibonacci
//********************************************************************

public class Fib
{

   public static void main (String [] args)
   {
   
      int[] Fib = {1,1,2,3,5,8,13,21,34,55};
      for(int x: Fib) 
      {
         System.out.println(x);
      }
      
      System.out.println("");
      System.out.println("");
   
      int one = 1;
      int two = 1;
      
      int size = 11;
      //highest Fib place
      
      System.out.println(one);
      System.out.println(two);
   
      for (int y = 0; y < size; y++)
      {
         if (one <= two)
         {
            one = one + two;
            System.out.println(one);
         }
         if (two < one)
         {
            two = one + two;
            System.out.println(two);
         }
         
      }
   
   }
}
