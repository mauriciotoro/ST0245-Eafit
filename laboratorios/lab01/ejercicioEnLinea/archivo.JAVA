*****************RECURSION 1**********************
//Factorial.
public int factorial(int n) { 
if(n==1){  
return 1; 
}  
return n*factorial(n-1);
}

//BunnyEars
public int bunnyEars(int bunnies) { 
if(bunnies==0){   
return 0; 
}  return 2+ bunnyEars(bunnies-1);
}

//BunnyEars2
public int bunnyEars2(int bunnies) {  
int a=2;  
if(bunnies % 2 ==0){ 
a=a +1;  
}  if(bunnies==0){    
return 0;
}  return a + bunnyEars2(bunnies-1);
}

//Triangle
public int triangle(int rows) {  
int a=rows;  
if(rows<=1){ 
return rows;  
}  return a  + triangle(rows-1);
}

//Fibonacci
public int fibonacci(int n) { 
if(n<=1){    
return n; 
}  return fibonacci (n-2)+ fibonacci(n-1);
}

******************************RECURSION 2***************************
//GroupSum5
public boolean groupSum5(int start, int[] nums, int target) { 
if (start >= nums.length) return target == 0;  
if (nums[start] % 5 == 0) {  
if (start < nums.length - 1 && nums[start + 1] == 1)         
return groupSum5(start + 2, nums, target - nums[start]);    
return groupSum5(start + 1, nums, target - nums[start]);   
}  return groupSum5(start + 1, nums, target - nums[start])  || groupSum5(start + 1, nums, target);}           

//GroupSum6
public boolean groupSum6(int start, int[] nums, int target) {
if (start >= nums.length) return target == 0;  
if (nums[start]  == 6) {    
return groupSum6(start + 1, nums, target - nums[start]);  
}    return groupSum6(start + 1, nums, target - nums[start])  || groupSum6(start + 1, nums, target);
}

//GroupSumClump
public boolean groupSumClump(int start, int[] nums, int target) {
if (start >= nums.length) return target == 0; 
if(start<nums.length-1 && nums[start]==nums[start+1]){ 
return groupSumClump(start + 2, nums, target-(nums[start] + nums[start+1])) ||    groupSumClump(start + 2, nums, target);  
}else{
return  groupSumClump(start + 1, nums, target) ||  groupSumClump(start + 1, nums, target-nums[start]);       
}    }

//GroupNoAdj
public boolean groupNoAdj(int start, int[] nums, int target) { 
if (start >= nums.length) return target == 0;  
return groupNoAdj(start + 2, nums, target - nums[start])   || groupNoAdj(start + 1, nums, target);
}

//SplitArray
public boolean splitArray(int[] nums) {
int suma1=0;
int suma2=0;
int start=0;
if(ayuda(nums,suma1,suma2,start)==true){  return true;
}else{  return false;}}
public boolean ayuda(int [] nums,int suma1,int suma2,int start){  
if(start>=nums.length){  
return suma1==suma2;    } 
return ayuda(nums,suma1+nums[start],suma2,start+1) || ayuda(nums,suma1,suma2+nums[start],start+1);  }
