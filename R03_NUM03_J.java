/******************************************************************************
 *Rule 03. Numeric Types and Operations (NUM)
 *(fileName:R03_NUM03_J.java) Use integer types that can fully represent the 
 *possible range of unsigned data Given the non-compliant code
 ******************************************************************************/

public static int getInteger(DataInputStream is)throws IOException{
    return is.readInt();
}
