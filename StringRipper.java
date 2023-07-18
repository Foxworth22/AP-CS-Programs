import static java.lang.System.*;
 
public class StringRipper
{
   private String word;
   
   public StringRipper()
   {
   
   }

   public StringRipper(String s)
   {
   setString(s);
   }
   
   public void setString(String s)
   {
   word = s;
   }  
   public String ripString(int x, int y)
   {
      String rip = word.substring (x,y);
      return rip;
   }

   public String toString()
   {
      return word;
   }

}