import static java.lang.System.*;
 
public class Name
{
   private String name;
   
   public Name()
   {
   
   }

   public Name(String s)
   {
   setName(s);
   }
   
   public void setName(String s)
   {
   name = s;
   }  
   public String getFirst()
    {
       int space = name.indexOf(" ");
       return name.substring(0,space);
    }
 
    public String getLast()
    {
       int space = name.indexOf(" ");
       return name.substring(space + 1,name.length());
    }

   public String toString()
   {
      return name;
   }

}