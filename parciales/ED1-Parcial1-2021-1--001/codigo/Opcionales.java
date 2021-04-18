import java.util.Arrays;
class Opcionales{
 public static int[] solve1(int Q, int[][] aq, int[] k){
    int[] result = new int[Q];
    for(int i = 0; i < Q; ++i){
      Arrays.sort(aq[i]); // Este usa Merge Sort
      result[i] = aq[i][k[i]];
    }
    return result;
  }

 public static  int[] solve2(int Q, int[][] aq, int[] k){
    int[] result = new int[Q];
    for(int i = 0; i < Q; ++i){      
      insertionSort(aq[i]); //Este es insertion sort
      result[i] = aq[i][k[i]];
    }
    return result;
  }

 private static  void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
  }

 public static void main(String[] args){
   System.out.println(solve1(1,new int[][]{{4,3,4654,3,2,30,0}},new int[]{3})[0]);
   System.out.println(solve2(1,new int[][]{{4,3,4654,3,2,30,0}},new int[]{3})[0]);
 }


}
