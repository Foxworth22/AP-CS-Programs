import java.util.Arrays;

public class OddAndEvensRunner

{

   public static void main( String args[] )
   
   {
   
      int[] one = {2,4,6,8,10,12,14};
      System.out.print("Odds - ");
      one = OddsAndEvens.getAllOdds(one);
      System.out.println(Arrays.toString(one));
      
      int[] oneAgain = {2,4,6,8,10,12,14};
      System.out.print("Evens - ");
      oneAgain = OddsAndEvens.getAllEvens(oneAgain);
      System.out.println(Arrays.toString(oneAgain));
      
      System.out.println("");
      
      int[] two = {1,2,3,4,5,6,7,8,9};
      System.out.print("Odds - ");
      two = OddsAndEvens.getAllOdds(two);
      System.out.println(Arrays.toString(two));
      
      int[] twoAgain = {1,2,3,4,5,6,7,8,9};
      System.out.print("Evens - ");
      twoAgain = OddsAndEvens.getAllEvens(twoAgain);
      System.out.println(Arrays.toString(twoAgain));
      
      System.out.println("");
      
      int[] three = {2,10,20,21,23,24,40,55,60,61};
      System.out.print("Odds - ");
      three = OddsAndEvens.getAllOdds(three);
      System.out.println(Arrays.toString(three));
      
      int[] threeAgain = {2,10,20,21,23,24,40,55,60,61};
      System.out.print("Evens - ");
      threeAgain = OddsAndEvens.getAllEvens(threeAgain);
      System.out.println(Arrays.toString(threeAgain));
   }

}