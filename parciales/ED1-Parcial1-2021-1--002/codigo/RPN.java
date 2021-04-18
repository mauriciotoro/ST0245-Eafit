import java.util.LinkedList;
class RPN{

 public static int solve(String[] tokens){
  String operators = "+-*/";
  LinkedList<String> aList = new LinkedList<String>();
  for(String t : tokens){
    if(!operators.contains(t)){
      aList.add(0,t);
    }else{
      int a = Integer.valueOf(aList.get(0));
      aList.remove(0);
      int b = Integer.valueOf(aList.get(0));
      aList.remove(0);
      int index = operators.indexOf(t);
      if(index == 0) 
       aList.add(0,String.valueOf(a+b));
      else if(index == 1)
       aList.add(0,String.valueOf(b-a));
      else if(index == 2)
       aList.add(0,String.valueOf(a*b));
      else
       aList.add(0,String.valueOf(b/a));
    }
  }
  String last = aList.get(0);
  return Integer.valueOf(last);
  }
 
  public static void main(String[] args){
    String[] arr = {"3","10","5","+","*"};
    System.out.println(solve(arr));
  }

}
