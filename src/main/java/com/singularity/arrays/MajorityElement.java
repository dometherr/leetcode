package com.singularity.arrays;

public class MajorityElement {

    // Boyer-Moore Voting Algorithm
    public int majorityElement(int[] nums) {
        int k = nums[0];
        int b = 1;

        for (int i = 1; i < nums.length; i++) {
            b += nums[i] == k ? 1 : -1;

            if (b < 1) {
                k = nums[i];
                b++;
            }
        }

        return k;
    }
}
