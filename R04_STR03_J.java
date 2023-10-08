/******************************************************************************
 *Rule 04. Characters and Strings (STR)
 *(FileName:R04_STR03_J.java) Do not encode noncharacter data as a string 
 *Given the non-compliant code
 ******************************************************************************/
BigInteger x = new BigInteger ("530500452766");
byte[]byteArray = x.toByteArray();
String s = new String(byteArray);
byteArray = s.getBytes();
x = new BigInteger(byteArray);
