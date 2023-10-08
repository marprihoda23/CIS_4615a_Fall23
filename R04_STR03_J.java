/******************************************************************************
 *Rule 04. Characters and Strings (STR)
 *(FileName:R04_STR03_J.java) Do not encode noncharacter data as a string 
 *Given the non-compliant code
 ******************************************************************************/
//Correct the code as shown in the Compliant Solution below:
BigInteger x = new BigInteger("530500452766");
String s = x.toString(); //Valid character data
byte[]byteArray = s.getBytes();
String ns = new String(byteArray);
x = new BigInteger(ns);
