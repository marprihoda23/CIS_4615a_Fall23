/******************************************************************************
 *Rule 06. Methods (MET)
 *(FileName:R06_MET01_J.java) Never use assertions to validate method arguments 
 *Given the non-compliant code
 ******************************************************************************/
public static int getAbsAdd(int x,int y){
    assert x != Integer.MIN VALUE;
    assert y != Integer.MIN VALUE;
    int absX = Math.abs(x);
    int absY = Math.abs(y);
    assert (absX <= Integer.MAX VALUE − absY);
    return absX + absY;
}
