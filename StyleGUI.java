import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StyleGUI
{
   private final int WIDTH = 300, HEIGHT = 100, FONT_SIZE = 36;
   
   private JLabel saying;
   private JCheckBox bold, italic, underline;
   private JPanel primary;
   
   
   
   public StyleGUI()
   {
      saying = new JLabel ("Say it with style!");
      saying.setFont (new Font ("Helvetica", Font.PLAIN, FONT_SIZE));
      
      bold = new JCheckBox ("Bold");
      bold.setBackground (Color.red);
      italic = new JCheckBox ("Italic");
      italic.setBackground (Color.yellow);
      underline = new JCheckBox ("Underline");
      underline.setBackground (Color.magenta);
            
      StyleListener listener = new StyleListener();
      bold.addItemListener (listener);
      italic.addItemListener (listener);
      underline.addItemListener (listener);
      
      primary = new JPanel();
      primary.add(saying);
      primary.add(bold);
      primary.add(italic);
      primary.add(underline);
      primary.setBackground (Color.orange);
      primary.setPreferredSize (new Dimension (WIDTH,HEIGHT));
      
      
   }
      public JPanel getPanel()
   {
      return primary;
   }
  
   private class StyleListener implements ItemListener
   {
      public void itemStateChanged (ItemEvent event)
      {
         int style = Font.PLAIN;
         
         if(bold.isSelected())
         {
         style = Font.BOLD;
         }
         if(italic.isSelected())
         {
         style += Font.ITALIC;
         }
         if(underline.isSelected())
         {
         style += Font.UNDERLINE;
         }
         saying.setFont (new Font ("Helvetica", style, FONT_SIZE));
      }
   }
}   