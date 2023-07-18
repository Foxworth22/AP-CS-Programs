import static java.lang.System.*;
import java.util.Scanner;


public class DiceRunner
{
   public static void main( String[] args )
   {
   
      Scanner keyboard = new Scanner(System.in);
   
      Dice test = new Dice();
      test.Go();
      test.Print();
   }
}