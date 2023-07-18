import static java.lang.System.*;
 
 public class FirstAndLast
 {
    private String word;
 
    public FirstAndLast(String s)
    {
    setString(s);
    }
 
    public void setString(String s)
    {
    word = s;
    }
 
    public String getFirst()
    {
       String first = word.substring(0,1);
       return first;
    }
    
    public String getLast()
    {
       String last = word.substring(word.length()-1);
       return last;
    }
 
    public String toString()
    {
       //String output="";
       return word;
    }
 }