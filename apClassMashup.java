//demo the use of a ArrayList on an object
//Miles Robertson
//Jan 12 2017
import java.util.ArrayList;
import java.util.*;

public class apClassMashup
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
      
      int rand = 0;
      int num = 0;
      int length = (int) (Math.random()* 5 + 3); //length of name
      int x = 0;
      
      for (int k = 0; k < length; k++)
      {
         rand = (int) (Math.random()* apclass.size() + 0); //random number (index of name chosen)
         num = apclass.get(rand).length(); //length of chosen name
         //System.out.println(rand);
         
         if (k < num)
         {
            System.out.print(apclass.get(rand).charAt(k));
         }
         //System.out.println(rand);
         //System.out.println(num);
         
      }
   }
}
