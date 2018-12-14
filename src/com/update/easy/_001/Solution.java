package com.update.easy._001;

/**
 * 给定一个整数数组 nums 和一个目标值 target，
 * 请你在该数组中找出和为目标值的那 两个 整数，
 * 并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9 所以返回 [0, 1]
 */
public class Solution {


    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {2,7,11,15};
        int[] arr2 =solution.twoSum(arr,9);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
    }

    public  int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int number = nums[i] + nums[j];
                if (target == number){
                    int[] result = {i,j};
                    return result;
                }
            }
        }
        return null;
    }

}
