class EjerciciosRecursion{
 public static int conejo(char[] A, int d, int k){
      return conejo(A, A.length, A[0].length, 0, 0, d, k);
 }

 private static int conejo(char[][] A, int n, 
 int m, int i, int j, int d, int k){                              
      if(i >= n || j >= m){
         return 0;
      }
      int sat = 0;
      if(A[i][j] == ‘*’){
         sat = d;
      }
      if(A[i][j] == ‘#’){
         sat = k;
      }
      if(i == n – 1 && j == m – 1){
         return _____________;
      }
      int fi = conejo(A, n, m, i + 1, j, d, k);
      int fj = conejo(A, n, m, i, j + 1, d, k);
      sat += _____________;
      return _____________;
 }
}
