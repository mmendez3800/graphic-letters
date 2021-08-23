import javax.swing.*;
import java.awt.*;

/** This class creates and displayes the letters created from our Graphic Letter class */
public class DisplayLetters
{
  public static void main( String[] args )
  {
    // We create a JFrame object and set its layout to a GridLayout with enough spaces to hold two copies of letters
    JFrame myFrame = new JFrame("Initials");
    myFrame.setLayout( new GridLayout(2, 4) );
    myFrame.setSize(200, 200);
    
    // We make one copy of our letter 'M' using new and we make another copy of 'M' by calling makeCopy()
    LetterM a1 = new LetterM();
    GraphicLetter a2 = a1.makeCopy();
    
    // We make one copy of our letter 'Z' using new and we make another copy of 'Z' by calling makeCopy()
    LetterZ b1 = new LetterZ();
    GraphicLetter b2 = b1.makeCopy();
    
    // We add each copy of our two letters to the JFrame
    myFrame.add(a1);
    myFrame.add(a2);
    myFrame.add(b1);
    myFrame.add(b2);
    
    /* We change the background color of the copied letters called by makeCopy() to ensure that these letters are
     * actually copies and not just references to the letters created by new */
    a2.setBackground( new Color(255, 20, 147) );
    b2.setBackground( new Color(0, 206, 209) );
    
    // We make the JFrame visible
    myFrame.setVisible(true);
    System.out.println(b2.getPreferredSize());
  }
}