/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpkl;

/**
 *
 * @author SAMSUNG
 */
public class MaxConsecutiveOnes {

   class solutions{
       public int findMaxConsecutiveOnes(int[] nums){
           int max = 0;
           int current_number_of_ones = 0;
           
           for (int i=0; i<nums.length; i++){
               if (nums[i] == 1){
                   current_number_of_ones += 1;
                   max = Math.max(max, current_number_of_ones);
               }else{
                   current_number_of_ones = 0;
               }
           }
           
           return max;
        
    }
   }
    
}
