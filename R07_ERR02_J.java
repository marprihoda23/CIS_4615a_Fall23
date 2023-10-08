/******************************************************************************
 *Rule 07: Exceptional Behavior (ERR)
 *ERR02-J. Prevent exceptions while logging data
 ******************************************************************************/
try {
  // ...
} catch (SecurityException se) {
  System.err.println(se);
  // Recover from exception
}
