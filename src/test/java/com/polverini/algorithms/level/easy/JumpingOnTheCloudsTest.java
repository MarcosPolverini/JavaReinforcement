package com.polverini.algorithms.level.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JumpingOnTheCloudsTest {

    private static final List<TestHolder> INPUTS = List.of(
            new TestHolder(List.of(0, 0, 1, 0, 0, 1, 0), 4),
            new TestHolder(List.of(0, 0, 0, 0, 1, 0), 3),
            new TestHolder(List.of(0, 0, 1, 0, 0, 0, 0, 1, 0, 0), 6),
            new TestHolder(List.of(0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0), 53)

    );

    @Test
    void test() {
        INPUTS.forEach(holder -> {
            final var result = JumpingOnTheClouds.jumpingOnClouds(holder.inputs);
            assertEquals(holder.result, result);
        });
    }

    private record TestHolder(List<Integer> inputs, int result) {
    }

}