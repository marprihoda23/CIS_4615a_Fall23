/******************************************************************************
 *Rule 05: Object Orientation (OBJ)
 *OBJ01-J: Limit accessibility of fields
 ******************************************************************************/

public class Widget {
  private int total; // Declared private
 
  public int getTotal () {
    return total;
  }
 
  // Definitions for add() and remove() remain the same
}
