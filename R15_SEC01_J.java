/******************************************************************************
 *Rule 13: Input Output (FIO)
 *FIO50-J. Do not make assumptions about file creation
 ******************************************************************************/
private void privilegedMethod(final String filename)throws FileNotFoundException {
  try {
    FileInputStream fis =(FileInputStream) AccessController.doPrivileged(new PrivilegedExceptionAction() {
          public FileInputStream run() throws FileNotFoundException {
              return new FileInputStream(filename);
        }
      }
    );
    //Do something with the file and then close it
  } catch (PrivilegedActionException e) {
    //Forward to handler
  }
}
