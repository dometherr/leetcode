package com.singularity.ararys;

import com.singularity.arrays.RemoveSomeDuplicates;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveSomeDuplicatesTest {
    static RemoveSomeDuplicates manipulator;

    @BeforeAll
    public static void beforeAll() {
        manipulator = new RemoveSomeDuplicates();
    }

    @Test
    public void arrayWithDuplicatesRemovesAtMostTwoEqualEntries() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        int k = manipulator.removeDuplicates(nums);

        int[] expectedNums = new int[]{0, 0, 1, 1, 2, 3, 3};
        int expectedK = expectedNums.length;

        assertThat(k).isEqualTo(expectedK);
        assertThat(nums).startsWith(expectedNums);
    }

    @Test
    public void emptyArrayShouldReturnKEqualsZero() {
        int[] nums = new int[]{};
        int k = manipulator.removeDuplicates(nums);

        int expectedK = 0;

        assertThat(k).isEqualTo(expectedK);
    }
}
