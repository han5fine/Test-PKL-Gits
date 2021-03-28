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

      public int findMaxConsecutiveOnes(int[] input) {
      int currentCount = 0;
      int max = 0;
      for (int n : input) {
      currentCount = n == 0 ? 0 : currentCount + 1;
      max = Math.max(max, currentCount);
      }
      return max;
    }
 
        public static void main(String[] args) {
         int[] input = { 1, 1, 1, 1, 0, 1, 1, 1 };
         System.out.println(new MaxConsecutiveOnes().findMaxConsecutiveOnes(input));
    }
}
    
