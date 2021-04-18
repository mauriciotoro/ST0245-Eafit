import java.util.LinkedList;
class Balanceo{
public static boolean solve(String exp){
  LinkedList<Character> s = new LinkedList();
  for(int i=0;i<exp.length();++i){
    char ei = exp.charAt(i);
    if(ei == '(' | ei == '{' | ei == '[')
      s.add(ei);
    if(ei == ')' | ei == '}' | ei == ']'){
      if(s.size() == 0 | !valid(s.get(s.size()-1), ei))
        return false;
      else{
        s.remove(s.size()-1);
      }
    }
  }
  return s.size() == 0;
}
public static boolean valid(char o, char c){
  return (o == '(' && c == ')') |
         (o == '[' && c == ']') |
         (o == '{' && c == '}');
}
public static void main(String[] args){
  System.out.println(solve("(3 + [a + b])"));
  System.out.println(solve("[(6 + {b + c} - 100])"));
}
}
