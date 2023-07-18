import static java.lang.System.*;
import java.util.Scanner;


public class RectangleRunner
{
   public static void main( String[] args )
   {
   
      Scanner keyboard = new Scanner(System.in);
   
      Rectangle test = new Rectangle();
      test.Directions();
      test.setLengthWidth(keyboard.nextInt(),keyboard.nextInt());
      test.calculatePerimeter( );
      test.print();
      test.space();
      test.r();
      test.s();
      test.r();
      
      
   }
}