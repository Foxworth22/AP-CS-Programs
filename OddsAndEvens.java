import java.util.Scanner;


public class OddsAndEvens
{
   private static int countEm(int[] array, boolean odd)
   {
      int count = 0;
      for (int num:array)
      {
         if (odd)
         {
            if (num%2 != 0)
            {
               count++;
            }
         }
         if (!odd)
         {
            if (num%2==0)
            {
               count++;
            }
         }
      }
      
      return count;
   }
   public static int[] getAllEvens(int[] array)
   {
      int spot = 0;
      int [] ret = new int [countEm(array, false)];
      
      for(int x: array)
      {
         if (x%2 == 0)
         {
            ret[spot++] = x;
         }
      }

      return ret;
   }
   public static int[] getAllOdds(int[] array)
   {
      int spotTWO = 0;
      int [] retTWO = new int [countEm(array, true)];
      
      for(int y: array)
      {
         if (y%2 == 1)
         {
            retTWO[spotTWO++] = y;
         }
      }

      
      return retTWO;      
   }
}