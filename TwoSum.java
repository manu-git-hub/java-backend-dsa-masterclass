
/*
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
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
*/



import java.util.Arrays;
import java.util.HashMap;

class TwoSum {

    // HashMap Solution (O(n))
    public int[] twoSumHash(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }
        return new int[0]; // safer than null
    }

    // Brute Force Solution (O(n^2))
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Test the twoSumHash method
        System.out.println("HashMap Solution:\n" + "Input: nums = " + Arrays.toString(nums) + ", target = " + target);
        int[] resultHash = twoSum.twoSumHash(nums, target);
        System.out.println("HashMap result: " + Arrays.toString(resultHash));

        // Test the twoSum method
        System.out.println("\nBrute Force Solution:\n" + "Input: nums = " + Arrays.toString(nums) + ", target = " + target);
        int[] resultBrute = twoSum.twoSum(nums, target);
        System.out.println("Brute Force result: " + Arrays.toString(resultBrute));
    }
}