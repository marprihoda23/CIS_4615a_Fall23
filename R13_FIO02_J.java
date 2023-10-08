/******************************************************************************
 *Rule 13: Input Output (FIO)
 *FIO02_J: Detect and handle file-related errors
 ******************************************************************************/
//This compliant solution checks the return value of delete():

File file = new File("file");
if (!file.delete()) {
  // Deletion failed, handle error
}
