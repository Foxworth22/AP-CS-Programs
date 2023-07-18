import static java.lang.System.*;
 
public class HiddenWord
{
   private String word;
   private String guess;
   private String result = "";
   
   public HiddenWord()
   {
   
   }

   public HiddenWord(String h)
   {
      setString(h);
   }
   public void setString(String s)
   {
      word = s;
   }
   public String getString()
   {
      return word;
   }
     
   public String getHint(String s)
   {
      result = "";
      guess = s;
      
      for (int x=0; x< guess.length(); x++)
      {
         if(guess.substring(x,x+1).equals(word.substring(x,x+1)))
         {
            result += guess.substring(x,x+1);
         }
         
         else 
         {
         if(word.indexOf(guess.substring(x,x+1)) != -1)
         {
            result += "+";
         }
         else
         {
            result += "*";
         }
         } 
      }
      return result;
   }

}