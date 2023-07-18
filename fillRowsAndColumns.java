//demo fill rows and columns
//
// January 9, 2017

import java.util.*;

public class fillRowsAndColumns
{
   public static void main( String args[] ) throws Exception
   {
      Scanner keyboard = new Scanner(System.in);
      
      int ROWS = 0;
      System.out.println("# of rows:");
      ROWS = keyboard.nextInt();
      
      int COLS = 0;
      System.out.println("# of Columns:");
      COLS = keyboard.nextInt();
      
      double [][] scores = new double[ROWS][COLS];
      
      //load table with values
      for (int row= 0; row<scores.length; row++)
      {
         for (int col = 0; col<scores[row].length; col++)
         {
            scores[row][col] = row*COLS + col;
         }
      }
      //print table
      for (int row= 0; row<scores.length; row++)
      {
         System.out.println();
         for (int col = 0; col<scores[row].length; col++)
         {
            System.out.print(scores[row][col] + "\t");
         }
         System.out.println();
      }
   
   }
}
