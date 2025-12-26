package com.singularity.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MajorityElementTest {
    static MajorityElement finder;

    @BeforeAll
    public static void beforeAll() {
        finder = new MajorityElement();
    }

    @Test
    public void arrayWithMajorityElementIsFindable() {
        int[] nums = new int[]{1, 2, 2, 3, 1, 2};
        int element = finder.majorityElement(nums);

        int expectedElem = 2;
        assertThat(element).isEqualTo(expectedElem);
    }
}
