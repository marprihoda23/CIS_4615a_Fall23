/******************************************************************************
 *Rule 06. Methods (MET)
 *(FileName:R06_MET01_J.java) Never use assertions to validate method arguments 
 *Given the non-compliant code
 ******************************************************************************/
// Usage:getAbsAdd(Integer.MIN VALUE,1);
//Correct the code as shown in theCompliant Solution below:
public static int getAbsAdd(int x,int y){
    if(x == Integer.MIN VALUE || y == Integer.MIN VALUE) {
      throw new IllegalArgumentException();
    }
    int absX = Math.abs(x);
    int absY = Math.abs(y);
    if(absX>Integer.MAX VALUE − absY){
      throw new IllegalArgumentException();
    }
    return absX + absY;
}
