/******************************************************************************
 *Rule 00. Input Validation and Data Sanitization (IDS)
 *(FileName:R00_IDS03_J.java) Do not log unsanitized user input Given the non-compliant code
 ******************************************************************************/
if(login Successful){
logger.severe("User login succeeded for:" + username);
}else{
  logger.severe("User login failed for:" + username);
}
