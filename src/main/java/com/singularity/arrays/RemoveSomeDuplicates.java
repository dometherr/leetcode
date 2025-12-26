package com.singularity.arrays;

public class RemoveSomeDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 0;
        int d = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[k]) {
                if (++d < 3) {
                    nums[++k] = nums[i];
                }
            } else {
                nums[++k] = nums[i];
                d = 1;
            }
        }

        return k + 1;
    }
}
