package com.singularity.arrays;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        k %= nums.length;

        if (k == 0) return;

        reverse(nums, 0, nums.length -1); // reverse the whole array O(n)
        reverse(nums, 0, k -1);           // reverse the first K elements O(k)
        reverse(nums, k, nums.length -1); // reverse the rest O(n - k)
    }

    void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }
}
