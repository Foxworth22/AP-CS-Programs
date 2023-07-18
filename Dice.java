/*
Miles Robertson
10-17-16
Per 6
Extra credit to display sum of a pair of dice rolled and how many
times each occurs when rolled a very large number of times.
*/

public class Dice
{
   int D1 = 0;
   int D2 = 0;
   int Sum = 0;
   int i=1;
   //number of rolls
   int Rolls = 3600;
   
   int R2=0;
   int R3=0;
   int R4=0;
   int R5=0;
   int R6=0;
   int R7=0;
   int R8=0;
   int R9=0;
   int R10=0;
   int R11=0;
   int R12=0;
   
   public void Roll()
   {
      D1 = ((int) (Math.random()*6+1));
      D2 = ((int) (Math.random()*6+1));
   }
   public void Result()
   {
      Sum = (D1 + D2);
      
      if (Sum == 2)
      {
         R2 = (R2 + 1);
      }
      if (Sum == 3)
      {
         R3 = (R3 + 1);
      }
      if (Sum == 4)
      {
         R4 = (R4 + 1);
      }
      if (Sum == 5)
      {
         R5 = (R5 + 1);
      }
      if (Sum == 6)
      {
         R6 = (R6 + 1);
      }
      if (Sum == 7)
      {
         R7 = (R7 + 1);
      }
      if (Sum == 8)
      {
         R8 = (R8 + 1);
      }
      if (Sum == 9)
      {
         R9 = (R9 + 1);
      }
      if (Sum == 10)
      {
         R10 = (R10 + 1);
      }
      if (Sum == 11)
      {
         R11 = (R11 + 1);
      }
      if (Sum == 12)
      {
         R12 = (R12 + 1);
      }
      
      
   }
   public void Print()
   {
      System.out.println("Number of 2's rolled: " + R2);
      System.out.println("Number of 3's rolled: " + R3);
      System.out.println("Number of 4's rolled: " + R4);
      System.out.println("Number of 5's rolled: " + R5);
      System.out.println("Number of 6's rolled: " + R6);
      System.out.println("Number of 7's rolled: " + R7);
      System.out.println("Number of 8's rolled: " + R8);
      System.out.println("Number of 9's rolled: " + R9);
      System.out.println("Number of 10's rolled: " + R10);
      System.out.println("Number of 11's rolled: " + R11);
      System.out.println("Number of 12's rolled: " + R12);
     
      //System.out.println("");
      //System.out.println(D1);
      //System.out.println(D2);
   }
   
   public void Go()
   {
      for(i=1; i<= Rolls; i++)
      {
         Roll();
         Result();
      }
   }
}