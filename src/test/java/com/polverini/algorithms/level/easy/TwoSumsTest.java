package com.polverini.algorithms.level.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumsTest {

    private static final List<TestHolder> INPUTS = List.of(
            new TestHolder(9, new int[]{2, 7, 11, 15}, new int[]{0, 1}),
            new TestHolder(6, new int[]{3, 2, 4}, new int[]{1, 2}),
            new TestHolder(6, new int[]{3, 3}, new int[]{0, 1}),
            new TestHolder(6, new int[]{3, 2, 3}, new int[]{0, 2}),
            new TestHolder(-8, new int[]{-1, -2, -3, -4, -5}, new int[]{2, 4})
    );

    @Test
    void test() {
        INPUTS.forEach(holder -> {
            final var result = TwoSum.twoSum(holder.input, holder.target);
            assertArrayEquals(holder.result, result);
        });
    }

    private record TestHolder(int target, int[] input, int[] result) {
    }

}