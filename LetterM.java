import java.awt.*;

/** This class is a sub-class of GraphicLetter which creates the letter 'M' */
public class LetterM extends GraphicLetter
{
  /** Returns a character representation of the letter that the graphic depicts
    * @return The character 'M' for the first initial of my first name
    * */
  public char whichChar()
  {
    return 'M';
  }
  
  /** Returns a new instance of the graphic character object that is implemented in this class
    * @return The new instance of the graphic character object
    * */
  public GraphicLetter makeCopy()
  {
    GraphicLetter variable = new LetterM();
    return variable;
  }
  
  /** Returns a Dimension object that specifies the size at which the graphic letter displays best
    * @return The Dimension which the graphic letter displays best
    * */
  public Dimension getPreferredSize()
  {
    return new Dimension(100, 100);
  }
  
  /** Draws the graphic letter of this class by overriding JPanel's paintComponent method */
  protected void paintComponent( Graphics g )
  {
    // Here we call the paintComponent of the JPanel
    super.paintComponent(g);
    
    // Here we obtain the width and height of the JFrame that will be used to display our graphic letter
    int width = getWidth();
    int height = getHeight();
    
    /* Here we draw the lines to form the letter 'M'. The width and height are used in the dimensions so that the letter
     * resizes whenever we change the dimension of the JFrame */
    g.drawLine(width / 4, height / 4, width / 4, height * 3 / 4);
    g.drawLine(width / 4, height / 4, width / 2, height / 2);
    g.drawLine(width / 2, height / 2, width * 3 / 4, height / 4);
    g.drawLine(width * 3 / 4, height / 4, width * 3 / 4, height * 3 / 4);
  }
}