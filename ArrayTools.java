

public class ArrayTools
{
    //instance variables and constructors could be present, but are not necessary
    
    //sumSection will return the sum of the numbers 
    //from start to stop, not including stop
   public static int sumSection(int[] numArray, int start, int stop)
   {
      int sum=0;
      for(int x = start; x < stop; x++)
      {
      sum = sum + numArray[x];
      }
      return sum;
   }
    
    //countVal will return a count of how many times val is present in numArray
   public static int countVal(int[] numArray, int val)
   {
      int count=0;
   
   for(int y = 0; y < numArray.length; y++)
   {
   if (numArray[y] == val)
   {
   count++;
   }
   }
   
   
   
   
   
      return count;
   }
}