//******************************************************************************
//Miles Robertson
//9-9-16
//Period 6
//Used to learn how to define, input, and output a variable
//******************************************************************************

import java.util.*;

public class Input
{
   public static void main (String[] args) 
   {
      Scanner keyboard = new Scanner(System.in);
      
      int intOne, intTwo;
      double d1, d2;
      float f1, f2;
      short s1, s2;
   
      System.out.print("Enter an integer :: ");
      intOne = keyboard.nextInt();
    //2
      System.out.print("Enter an integer :: ");
      intTwo = keyboard.nextInt(); 
    //3
      System.out.print("Enter a double :: ");
      d1 = keyboard.nextDouble();
    //4
      System.out.print("Enter a double :: ");
      d2 = keyboard.nextDouble();
    //5
      System.out.print("Enter a float :: ");
      f1 = keyboard.nextFloat();
    //6
      System.out.print("Enter a float :: ");
      f2 = keyboard.nextFloat();
    //7
      System.out.print("Enter a short :: ");
      s1 = keyboard.nextShort();
    //8
      System.out.print("Enter a short :: ");
      s2 = keyboard.nextShort();
    //9
   
   
      System.out.println(" ");    
      System.out.println("integer one = " + intOne);
      System.out.println("integer two = " + intTwo);
      System.out.println(" ");
      System.out.println("double one = " + d1);
      System.out.println("double two = " + d2);
      System.out.println(" ");
      System.out.println("float one = " + f1);
      System.out.println("float two = " + f2);
      System.out.println(" ");
      System.out.println("short one = " + s1);
      System.out.println("short two = " + s2);
   
   
   }
}