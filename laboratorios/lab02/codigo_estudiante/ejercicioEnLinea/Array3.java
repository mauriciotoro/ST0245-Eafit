public class Array3 {

    public int maxSpan(int[] nums) {
        int max = 0;//C
        for (int i = 0; i < nums.length; i++) {//n*C

            int j = nums.length - 1;//n*C
            for (;; j--) {//n*n*C
                if (nums[j] == nums[i]) {//n*n*C
                    break;//n*n*C
                }
            }

            int span = j - i + 1;//n*C

            if (span > max) {//n*C
                max = span;//n*C
            }
        }
        return max;//C
        //Complejidad O(n*n)
    }

    public int[] fix45(int[] nums) {
       
    }

    public boolean canBalance(int[] nums) {
       
    }

    public boolean linearIn(int[] outer, int[] inner) {
       
    }

    public int[] seriesUp(int n) {
      
    }
}
