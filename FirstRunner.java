import static java.lang.System.*;
 
public class FirstRunner
{
   public static void main ( String[] args )
   {
      FirstAndLast demo = new FirstAndLast("Hello");
      System.out.println( "word :: " + demo.toString() );
      System.out.println( "first letter :: " + demo.getFirst() );
      System.out.println( "last letter :: " + demo.getLast() );
       
      //add more test cases
      /*   
      System.out.println();
      System.out.println();
      demo.setString("World");
      System.out.println( "word :: " + demo.toString() );
      System.out.println( "first letter :: " + demo.getFirst() );
      System.out.println( "last letter :: " + demo.getLast() );
       
      System.out.println();
      System.out.println();
      demo.setString("JukeBox");
      System.out.println( "word :: " + demo.toString() );
      System.out.println( "first letter :: " + demo.getFirst() );
      System.out.println( "last letter :: " + demo.getLast() );
       
      System.out.println();
      System.out.println();
      demo.setString("TCEA");
      System.out.println( "word :: " + demo.toString() );
      System.out.println( "first letter :: " + demo.getFirst() );
      System.out.println( "last letter :: " + demo.getLast() );
       
      System.out.println();
      System.out.println();
      demo.setString("UIL");
      System.out.println( "word :: " + demo.toString() );
      System.out.println( "first letter :: " + demo.getFirst() );
      System.out.println( "last letter :: " + demo.getLast() );
      */
      for (int x=2; x<=5; x++)
      {
         if(x == 2)
         {
            demo.setString("World");
         }
         if(x == 3)
         {
            demo.setString("JukeBox");
         }
         if(x == 4)
         {
            demo.setString("TCEA");
         }
         if(x == 5)
         {
            demo.setString("UIL");
         }
         System.out.println();
         System.out.println();
         System.out.println( "word :: " + demo.toString() );
         System.out.println( "first letter :: " + demo.getFirst() );
         System.out.println( "last letter :: " + demo.getLast() );
      }
   }
}