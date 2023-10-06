/******************************************************************************
 *Rule 07: Exceptional Behavior (ERR)
 *ERR50-J. Use exceptions only for exceptional conditions
 ******************************************************************************/
public String processSingleString(String string){
    // . . .
    return string;
  }
public String processStrings(String[] strings){
  String result = "";
  int i = 0;
  try{
    while(true){
      result = result.concat(processSingleString(string[i]));
      i++;
    }
  }catch(ArrayIndexOutOfBoundsException e){
    //ignore, we're done
  }
  return result;
}
