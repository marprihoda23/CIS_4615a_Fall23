/******************************************************************************
 *Rule 02. Expressions (EXP)
 *(FileName:R02_XP00_J.java) Do not ignore values returned by methods Given the non-compliant code
 ******************************************************************************/
//Correct the code as shown in theCompliant Solution below:
public void deleteFile(){
    File someFile = new File("someFileName.txt");
    // Do something with someFile
    if(!someFile.delete()){ 
        //Handle failure to delete the file
    }
}
