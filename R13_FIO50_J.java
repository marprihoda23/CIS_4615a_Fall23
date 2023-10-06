/******************************************************************************
 *Rule 13: Input Output (FIO)
 *FIO50-J. Do not make assumptions about file creation
 ******************************************************************************/
public void createFile(String filename)
    throws IOException{
  OutputStream out = new FileOutputStream(filename, true);
  if (!new File(filename).createNewFile()) {
      // File cannot be created...handle error
  } else {
      out = new FileOutputStream(filename);
      // Work with file
  }
}
