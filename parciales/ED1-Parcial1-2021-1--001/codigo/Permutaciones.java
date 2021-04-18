import java.util.ArrayList;
class Permutaciones{
public static ArrayList<String> solve(String s) {
  ArrayList<String> sol = new ArrayList();
  tmp("", s, 0, s.length() - 1, sol);
  return sol;
}
public static void tmp(String l,String s,int i,int j, ArrayList<String> sol)
{
  if (i > j) {
    sol.add(l);
    return;
  }
  String c = "" + s.charAt(i);
  c = c.toLowerCase();
  tmp(l + c, s, i + 1, j, sol);
  String k = "" + s.charAt(i);
  k = k.toUpperCase();
  if (!c.equals(k)) {
    tmp(l + k, s, i + 1, j, sol);
  }
}
public static void main(String[] args){
  System.out.println(solve("as22b"));
  System.out.println(solve("123"));
  System.out.println(solve("1B4"));
}
}
