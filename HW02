/******************************************************************************
 *  10 short programming examples with known security deficiencies and their Solutions
 *
 *  Marielle Prihoda 
 *  HW 02 CIS4615
 *  Due Oct 8th
 *
 * 5 Mandatory Vulnerabilities
 ******************************************************************************/

/******************************************************************************
 *Rule 00. Input Validation and Data Sanitization (IDS)
 ******************************************************************************/
//(FileName:R00_IDS03_J.java) Do not log unsanitized user input Given the non-compliant code
if(login Successful){
logger.severe("User login succeeded for:" + username);
}else{
  logger.severe("User login failed for:" + username);
}

//Correct the code as shown in theCompliant Solution below:
if(loginSuccessful){
  logger.severe("User login succeeded for:" + sanitize User(username));
}else{
  logger.severe("User login failed for:" + sanitizeUser( username ));
}
public String sanitizeUser(String username){
  return Pattern.matches( "[A−Za−z0−9]+",username))
    ? username:"unauthorized user";
}

/******************************************************************************
 *Rule 02. Expressions (EXP)
 ******************************************************************************/
//(FileName:R02_XP00_J.java) Do not ignore values returned by methods Given the non-compliant code
public void deleteFile(){
    File someFile = new File("someFileName.txt");
    // Do something with someFile
    someFile.delete();
}

//Correct the code as shown in theCompliant Solution below:
public void deleteFile(){
    File someFile = new File("someFileName.txt");
    // Do something with someFile
    if(!someFile.delete()){ 
        //Handle failure to delete the file
    }
}

/******************************************************************************
 *Rule 03. Numeric Types and Operations (NUM)
 ******************************************************************************/
//(fileName:R03_NUM03_J.java) Use integer types that can fully represent the possible range of unsigned data Given the non-compliant code
public static int getInteger(DataInputStream is)throws IOException{
    return is.readInt();
}

//Correct the code as shown in theCompliant Solution below:
public static long getInteger (DataInputStream is) throws IOException{
    return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one−bits
}

/******************************************************************************
 *Rule 04. Characters and Strings (STR)
 ******************************************************************************/
//(FileName:R04_STR03_J.java) Do not encode noncharacter data as a string Given the non-compliant code
BigInteger x = new BigInteger ("530500452766");
byte[]byteArray = x.toByteArray();
String s = new String(byteArray);
byteArray = s.getBytes();
x = new BigInteger(byteArray);

//Correct the code as shown in the Compliant Solution below:
BigInteger x = new BigInteger("530500452766");
String s = x.toString(); //Valid character data
byte[]byteArray = s.getBytes();
String ns = new String(byteArray);
x = new BigInteger(ns);

/******************************************************************************
 *Rule 06. Methods (MET)
 ******************************************************************************/
//(FileName:R06_MET01_J.java) Never use assertions to validate method arguments Given the non-compliant code
public static int getAbsAdd(int x,int y){
    assert x != Integer.MIN VALUE;
    assert y != Integer.MIN VALUE;
    int absX = Math.abs(x);
    int absY = Math.abs(y);
    assert (absX <= Integer.MAX VALUE − absY);
    return absX + absY;
}

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
