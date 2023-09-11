package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

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