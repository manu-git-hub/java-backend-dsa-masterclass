package Manu.array;

public class largestArray {
    class Solution {
    public static int largest(int[] arr) {
        // code here
        int target =0;
        for(int i=0; i<arr.length; i++){
                if(arr[i] > target){
                    target = arr[i];
                
            }
        }
        return target;
    }
}

    
}


/*

https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article


Given an array arr[]. The task is to find the largest element and return it.

Examples:

Input: arr[] = [1, 8, 7, 56, 90]
Output: 90
Explanation: The largest element of the given array is 90.
Input: arr[] = [5, 5, 5, 5]
Output: 5
Explanation: The largest element of the given array is 5.
Input: arr[] = [10]
Output: 10
Explanation: There is only one element which is the largest.
Constraints:
1 <= arr.size()<= 106
0 <= arr[i] <= 106
*/