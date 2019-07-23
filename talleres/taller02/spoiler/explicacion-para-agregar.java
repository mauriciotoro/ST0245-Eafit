/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_2;

/**
 *
 * @author cl18417
 */
public class Taller2 {
    
     public static int gcd(int p,int q){
        if (q == 0){
            return p;
        }else{
            return gcd(q,p%q);
    }
    }
 
     public static boolean SumaGrupo(int start,int[]nums,int target){
         System.out.println(start + " "+ target);
         if (start >= nums.length) {
             if (target == 0)
                 return true;
             else
                 return false;
         }else{ // start < nums.length
            boolean universo1 = SumaGrupo(start + 1,nums,target - nums[start]);
            if (universo1)
                return true;
            else{
                boolean universo2 = SumaGrupo(start + 1,nums,target);
                if (universo2 == true)
                     return true;
                else
                    return false;
            }
         }
     }
     
}
