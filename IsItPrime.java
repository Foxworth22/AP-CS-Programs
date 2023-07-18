
//Demonstrates the use of the JOptionPane class.

//**********************************************

import javax.swing.JOptionPane;

public class IsItPrime
{

   public static void main (String [] args)
   {
   
   
   
      String numStr, result;
      long num, again, output;
   
      do {
         numStr = JOptionPane.showInputDialog ("Enter an integer: ");
      
         num = Integer.parseInt(numStr);
         output = 0;
         
         for(long x = num/2; x > 1; x--)
         {
            if(num%x == 0)
            {
               output = -1;
            }
         }
         result = "That number is " + ((output==0) ? "prime" : "not prime"); 
      
         JOptionPane.showMessageDialog (null, result);
         again = JOptionPane.showConfirmDialog (null, "Do Another?");
      }
      while (again ==JOptionPane.YES_OPTION);
   }

}