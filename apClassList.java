//demo the use of a ArrayList on an object
//Miles Robertson
//Jan 12 2017
import java.util.ArrayList;
import java.util.*;

public class apClassList
{
   public static void main( String args[] )
   {
         
      ArrayList<String>apclass;
      apclass = new ArrayList<String>();
      
      apclass.add("Manny");
      apclass.add("Chanel");
      apclass.add("Anu");
      apclass.add("Gustavo");
      apclass.add("Melanie");
      apclass.add("Marcos");
      apclass.add("Annie");
      apclass.add("Ena");
      apclass.add("Cullen");
      apclass.add("Juan");
      apclass.add("Astrid");
      apclass.add("Ruth");
      apclass.add("Peter");
      apclass.add("Usam");
      apclass.add("Cheyenne");
      apclass.add("Lelaynia");
      apclass.add("Miles");
      apclass.add("Allen");
      apclass.add("Yousef");
      apclass.add("Martin");
      apclass.add("Aidan");
      apclass.add("Jalesa");
      apclass.add("Jonas");
      apclass.add("Crystal");
      
      System.out.println("Number of names with an even # of letters: " + CountEvenLength (apclass));
      
      
      /*System.out.println(apclass);
      
      System.out.println(apclass.get(2));
      
      System.out.println(apclass.size());
      
      System.out.println(apclass.set(5,"McHugh"));
      //System.out.println(apclass);
      
      System.out.println(apclass.remove(8));
      //System.out.println(apclass);
      */
   }
   public static int CountEvenLength (ArrayList apclass)
   {
      int count = 0;
      for (int num = 0; num < apclass.size(); num++)
      {
      
         if (((String)apclass.get(num)).length() % 2 == 0)
         {
            count = count + 1;
         } 
      }
      //System.out.println(count);
      return count;
   }
}
