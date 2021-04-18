class LCS{
  public static int solve(String s, String t){
    return solve(s, t, s.length(), t.length()); 
  }
  public static int solve(String s, String t, int i, int j){
    if(i == 0 || j == 0) 
      return 0;
    if(s.charAt(i - 1) == t.charAt(j - 1))
      return 1 + solve(s, t, i - 1, j - 1);
    //else
    return Math.max(solve(s, t, i, j - 1), solve(s, t, i - 1, j));
  }
  public static void main(String[] args){
    System.out.println(solve("aa", "xayaz"));
  }

}
