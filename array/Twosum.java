
/* 1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
 Output: [0,1] */ 



import java.util.HashMap;
import java.util.Scanner;
class Twosum {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remaining=target-nums[i];
            if(mp.containsKey(remaining)){
                return new int[]{mp.get(remaining),i};
            }
            mp.put(nums[i],i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target;
        System.err.println("enter target");
        target=sc.nextInt();
        System.out.println("enter the no of elements ");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.err.println("enter thee elements");
          for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Twosum obj=new Twosum();

      int[] result = obj.twoSum(nums, target);
    if (result.length == 2) {
        System.out.println("Indices of numbers adding to target: " + result[0] + " and " + result[1]);
}   else {
         System.out.println("No valid pair found.");
}
sc.close(); 

    }
}