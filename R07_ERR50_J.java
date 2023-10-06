/******************************************************************************
 *Rule 07: Exceptional Behavior (ERR)
 *ERR50-J. Use exceptions only for exceptional conditions
 ******************************************************************************/
public String processSingleString(String[] string){
    String result = "";
    for(int i=0; i<strings.length; i++){
        result = result.concat(processSingleString(strings[i]));
    }
    return result;
}
