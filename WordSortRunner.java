import java.util.Arrays;
import static java.lang.System.*;

public class WordSortRunner
{
   public static void main(String args[])
   {
   //add test cases
   
      WordSort test = new WordSort("abc ABC 12321 fred alexander");
      test.sort();
   //test.toString();
      System.out.println(test);
      
      test.setList("a zebra friendly acrobatics 435 TONER PRinTer");
      test.sort();
   //test.toString();
      System.out.println(test);
      
      test.setList("b x 4 r s y $");
      test.sort();
   //test.toString();
      System.out.println(test);
      
      test.setList("123 ABC abc 034 dog cat sally sue bob 2a2");
      test.sort();
   //test.toString();
      System.out.println(test);
      
      
   }
}