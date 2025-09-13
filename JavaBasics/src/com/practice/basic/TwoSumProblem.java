package com.practice.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class TwoSumProblem {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement),i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = {7,8,11,2};
        int target = 9;
        System.out.println("sub Array: "+ Arrays.toString(twoSum(arr, target)));

        /**
         * provide input for finding length of longest subArray possible.
         */
        char[] charArr = {'a', 'b', 'd', 'a', 'c', 'd'};
        System.out.println("length of longest possible non repeating sub Array: "+lengthOfLongestsubArray(charArr));
    }

    public static int lengthOfLongestsubArray(char[] arr) {
        HashSet<Character> set = new HashSet<Character>();
        int left = 0, maxlength = 0;
        for (int right = 0; right<arr.length; right++){
            while (set.contains(arr[right])){
                set.remove(arr[left]);
                left++;
            }
            set.add(arr[right]);
            maxlength = Math.max(maxlength,right - left + 1);
        }
        return maxlength;
    }
}


