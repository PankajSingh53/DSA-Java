/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */


import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};

        int[] arr1 = twoSum(arr,18);

        for(int i=0 ; i<arr1.length;i++){
            System.out.println("index : "+arr1[i]+" value : "+arr[i]);
        }

    }

    static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){

            int compliment = target - nums[i];

            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }

            map.put(nums[i],i);
        }

        throw new IllegalArgumentException("No two sum solution");

    }
}