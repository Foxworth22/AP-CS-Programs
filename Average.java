/*
Miles Robertson
10-17-16
Per 6
Used to find the average of a certain number of inputed numbers
*/

import java.util.*;
import java.util.Scanner;


class Average
{
   private double x, sums, average, n;
   
   public void number( )
   {
      Scanner keyboard = new Scanner(System.in);
   
      System.out.print("Number of numbers to be averaged: ");
      System.out.println("");
      n = keyboard.nextDouble();
      System.out.println("");
   }
   public void setNums( )
   {
      System.out.println("Enter numbers to be averaged:");
      Scanner keyboard = new Scanner(System.in);
     
      sums = 0; 
      for (x=1; x <= n; x++)
      {
         sums += keyboard.nextDouble();
      }
   }
   public void average( )
   {
      average = (sums/n);
      
   }
   public void print( )
   {
      System.out.println("");
      System.out.print("Average of entered values: ");
      
      if (average % 1 == 0)
      {
         System.out.println((int)average);
      }
      else
      {
      System.out.println(average);
      }
   }
}