package Manu.array;

public class arraySortedorNot {
    class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        } return true;
    }
}
}


/*

https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1

Check if array is sorted
Difficulty: EasyAccuracy: 39.37%Submissions: 387K+Points: 2Average Time: 15m
Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

Examples:

Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted.
Input: arr[] = [90, 80, 100, 70, 40, 30]
Output: false
Explanation: The given array is not sorted.
Constraints:
1 ≤ arr.size ≤ 106
- 109 ≤ arr[i] ≤ 109
*/