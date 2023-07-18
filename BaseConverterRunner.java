import static java.lang.System.*;
import java.util.Scanner;


public class BaseConverterRunner
{
   public static void main( String[] args )
   {
   
      Scanner keyboard = new Scanner(System.in);
   
   //   int input = 0;
      System.out.print("Number to convert: ");
      int inputNum = keyboard.nextInt();
      System.out.print("Current base: ");
      int inputBaseCurr = keyboard.nextInt();
      System.out.print("Base to convert to: ");
      int inputBaseGoal = keyboard.nextInt();

      BaseConverter test = new BaseConverter();
      test.Convert(inputNum, inputBaseCurr, inputBaseGoal);
      
   }
}