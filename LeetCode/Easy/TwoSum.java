package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

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
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity? */

class TwoSum {
    //Time complexity for this solution is O(n^2)
    //Space Complexity is O(1)
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];

        for(int i=0; i< nums.length;i++){
            for(int j=0;j<nums.length;j++){

                if(j == i){
                    continue;
                } else{
                    if(target == nums[i] + nums[j]){
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
        }
        return result;
    }

    /*
     * But often we can get more memory but not more time thats why we can reduce this 
     * time complexity to O(n) and Space Complexity to O(n)
     */

    public int[] twoSumTimeEfficient(int[] nums, int target) {
        
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int num2 = target - nums[i];

            if(map.containsKey(num2)){
                return new int[] {i,map.get(num2)};
            } else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}