import javax.swing.JPanel;

/**
 * This class implements the base functionality for a graphic letter
 * implemented in a JPanel.
 * */

public class GraphicLetter extends JPanel
{
  /** Returns the character that this class displays graphically.
    * The character returned should reflect the case as well as the 
    * letter that is displayed.
    * @return The character that this graphic letter displays.
    * */
  public char whichChar()
  {
    // for now return the null char.  You will override this method.
    return '\u0000';
  }
  
  /** Return a new instance of the particular GraphicLetter object.
    * @return A new instance of the GraphicLetter in question.
    * */
  public GraphicLetter makeCopy()
  {
    // this method just returns null.  You must override this method.
    // You should not need to change the signature when you override it.
    return null;
  }
}