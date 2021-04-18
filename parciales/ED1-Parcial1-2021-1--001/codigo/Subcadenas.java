class Subcadenas{
public static int solve(String s, int k){
  if(s.length() < k) return 0;
  int[] count = new int[26];
  for(int i = 0; i < k; ++i){
    assert s.charAt(i) - 97 >= 0;
    count[s.charAt(i) - 97]++;
  }
  int ans = check(count) ? 1: 0;
  for(int i = k; i < s.length(); ++i){
    count[s.charAt(i - k) - 97] --;
    count[s.charAt(i) - 97] = count[s.charAt(i) - 97] + 1;
    if(check(count)){
      ans++;
    }
  }
  return ans;
}
public static boolean check(int[] count){
  for(int i = 0; i < 26; ++i){
    if(count[i] > 1) return false;
  }
  return true;
}
public static void main(String[] args){
  System.out.println(solve("andamasqueyo",5));
  System.out.println(solve("casa",5));
}
}
