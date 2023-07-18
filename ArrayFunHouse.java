/*
Miles Robertson
11-7-16
Per 6
Inroduction to Arrays
*/

import java.lang.System;
import java.lang.Math;

public class ArrayFunHouse
{
   //instance variables and constructors could be used, but are not really needed
   //getSum() will return the sum of the numbers from start to stop, not including stop
   public static int getSum(int[] numArray, int start, int stop)
   {
      int x=0;
      int begin=start;
      int end=stop;
     
      while(begin <= end)
      {
         x = x + numArray[begin];
         begin = begin + 1;
      }
      
      return x;
   }
   //getCount() will return number of times val is present
   public static int getCount(int[] numArray, int val)
   {
      int valu = val;
      int y=0;
      int n=0;
      
      while(y<numArray.length)
      {
         if (numArray[y] == valu)
         {
            n = n+1;
         }
         y = y+1;
      }
      return n;
   }

   public static int[] removeVal(int[] numArray, int val)
   {
      int [] result = new int [numArray.length-getCount(numArray, val)];
      for (int i= 0; i < result.length;  i++)
      {
         if(numArray[i] != val)
         {
            result[i] = numArray[i];
         }
      }
      
   /*
      int valu = val;
      int y=0;
      int n=0;
      int m=0;
      int thirdcup =0;
      
      while(y<numArray.length)
      {
         if (numArray[y] != valu)
         {
            m = m+1;  
         }
         /*
         else
         {
            
         }
         */
   /*
         y = y+1;
      }
   /*
      int[] without = new int[m];
      System.out.println(m);
      int [] remove = new int[m];
      
      while(n<m)
      {
         if (numArray[n] != valu)
         {
            thirdcup = numArray[n];
            remove[n] = thirdcup;  
         }
         /*
         else
         {
            
         }
         */
   /*
         n=n+1;
      }
      */
      return result;
      //how can i make it not print the jibberish?
      //System.out.println(Arrays.toString(remove));
   }
   /*public static int[] print()//supposed to be a new method
   {
    
   }*/
   

}