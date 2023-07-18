import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;



public class ArrayListFunHouse
{
   public static ArrayList<Integer> getListOfFactors(int number)
   {
      ArrayList<Integer> factors = new ArrayList<Integer>();
      int num = number;
      for(int x = num; x > 0; x--)
      {
         if(num % x == 0)
         {
            factors.add(0, x);
         }
      }
      
      
      return factors;
   }
   
   public static void keepOnlyCompositeNumbers( List<Integer> nums )
   {
      int size = nums.size() - 1;
      while (size >= 0)
      {
         int item = nums.get(size);
         ArrayList<Integer> factors = getListOfFactors(item);
         if (factors.size() == 2)
         {
            nums.remove(size);
         }
         size--;
      }
   
   
   /*
   //ArrayList<Integer> factors = getListOfFactors(nums.get(nums.size - 1));
      for(int i = 0; i < nums.size(); i++)
      {
         if (getListOfFactors(i).size() < 3)
         {
         nums.remove(i);//does it work?
         }
         
      }
   */
   }
}