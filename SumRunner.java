import java.util.*;
import java.util.Scanner;

public class SumRunner
{
   public static void main( String[] args )
   {
      Scanner keyboard = new Scanner(System.in);
      
      Sum test = new Sum();
      test.setNums(keyboard.nextDouble(),keyboard.nextDouble());
      test.sum();
      test.print();
      
      
   }
}
