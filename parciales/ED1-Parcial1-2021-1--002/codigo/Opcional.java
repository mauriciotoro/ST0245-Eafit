class Opcional{
  public static int solve(int[] a, int k, int n, int i){
    if(i == n - 1){
      return 0; 
    }
    int res = Integer.MAX_VALUE;
    for (int j = 1; j <= k; ++j){
      if(j + i >= n) break;
      res = Math.min(res, solve(a, k, n, j + i) + Math.abs(a[j + i] - a[i]));
    }
    return res;
  }
  public static boolean mariaCanGoToN(int[] a, int k, int M){
    return solve(a, k, a.length, 0) <= M;
  }
  public static void main(String[] args){
    System.out.println(mariaCanGoToN(new int[]{1,2,2,1,3,2,1}, 2 ,4));
    System.out.println(mariaCanGoToN(new int[]{1,2,2,1,3,2,1}, 2 ,1));
  }
}
