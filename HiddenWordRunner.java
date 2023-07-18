import static java.lang.System.*;
import java.util.Scanner;
 
public class HiddenWordRunner
{
   public static void main ( String[] args )
   {
      Scanner keyboard = new Scanner(System.in);
      
      HiddenWord demo = new HiddenWord("Default");
      demo.setString("iwilltestit");
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      String answer = demo.getString();
      int answerLength = answer.length();
      
      //String input = keyboard.nextLine();
      out.println("KEY");
      out.println("+ = elsewhere in string");
      out.println("* = nowhere in string");
      out.println("");
      String input = new String();
      while (!(input.equals(answer)))
      {
      
      //out.println(input + answer);
      out.println("Guess a string that has " + answerLength + " letters: ");
      input = keyboard.nextLine();
      out.println(demo.getHint(input));
      out.println();
      }
      
      
      //test an input with more characters than the answer
      
      
   //out.println();   
   }
}