public class Recursion{
  private static int solve(int[] a, int i, int j){
    if (i == j) return a[i];
    return Math.max(a[i] - solve(a, i + 1, j), a[j] - solve(a, i, j - 1));
  }
  public static int solve(int[] a){
    return solve(a, 0, a.length -1); 
  }
  public static void main(String[] args){
     System.out.println(solve(new int[]{10, 80, 90, 30}));
     System.out.println(solve(new int[]{10, 20, 30, 50}));
  }
}
