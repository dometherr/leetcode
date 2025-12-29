package com.singularity.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RotateArrayTest {
    static RotateArray rotator;

    @BeforeAll
    public static void beforeAll() {
        rotator = new RotateArray();
    }

    @Test
    public void rotationRunsForKSteps() {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int steps = 3;

        rotator.rotate(nums, steps);

        int[] expectedNums = new int[] { 5, 6, 7, 1, 2, 3, 4 };
        assertThat(nums).isEqualTo(expectedNums);
    }

    @Test
    public void rotationSkipsWhenKEqualsArraySize() {
        int[] nums = new int[] { 3, 4, 5, 6, 9, 10 };
        int steps = 6;
        
        rotator.rotate(nums, steps);

        int[] expectedNums = new int[] { 3, 4, 5, 6, 9, 10 };
        assertThat(nums).isEqualTo(expectedNums);
    }
}
