
/**
 * Write a description of class lalalara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lalalara
{
public static void prefijos(String base, String s){
    if (s.length() == 0){
        System.out.println(base);
    }
    else {
        prefijos (base + s.charAt(0), s.substring(1));
        System.out.println(base);
    }    
}
    
public static int getHcost(int[] board){
  int h = 0;
  for (int i = 0; i < board.length; i++){
    //Check every column we haven't already checked
    for (int j = i+1; j < board.length; j++){ 
      //Queens are in the same row
      if (board[i] == board[j])
        h += 1;
      //Get the difference between the current column
      //and the check column
      int offset = j - i;
      //To be a diagonal, the check column value has to be 
      //equal to the current column value +/- the offset
      if (board[i] == board[j] - offset || board[i] == board[j] + offset)
        h += 1;     
    }
  }
  return h;
}
  
  
}
