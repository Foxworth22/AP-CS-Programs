/*
Miles Robertson
10-17-16
Per 6
Extra credit to display sum of a pair of dice rolled and how many
times each occurs when rolled a very large number of times.
*/

public class BaseConverter
{
   
   
   public void Convert(int inNum, int inBase1, int inBase2)
   {
      int num = inNum;
      int baseCurr = inBase1;
      int baseGoal = inBase2;
      int counter = 0;
      
      
      /*
      for(int x=0; Math.pow(baseGoal,x) >= num; x++)
      {
      counter = x;
      }
      counter = counter - 1;
     // int [] result = new int[counter];
     // why wont this work?                           
      */
      
      System.out.println(num + " " + baseCurr +  " " + baseGoal);
      System.out.println(counter);
   }
   public int HighestPow()
   {
      while (num <= Math.pow(baseGoal,x))
      {
         x++;
      }
      return x;
   }
   public void Print()
   {
      
   }
}