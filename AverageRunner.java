import java.util.*;
import java.util.Scanner;

public class AverageRunner
{
   public static void main( String[] args )
   {
      Scanner keyboard = new Scanner(System.in);
      
      Average test = new Average();
      test.number();
      test.setNums();
      test.average();
      test.print();
      
   }
}
