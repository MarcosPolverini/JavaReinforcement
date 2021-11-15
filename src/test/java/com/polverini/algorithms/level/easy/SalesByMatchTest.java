package com.polverini.algorithms.level.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalesByMatchTest {

    private static final List<TestHolder> INPUTS = List.of(
            new TestHolder(9, List.of(10, 20, 20, 10, 10, 30, 50, 10, 20), 3),
            new TestHolder(10, List.of(1, 1, 3, 1, 2, 1, 3, 3, 3, 3), 4),
            new TestHolder(7, List.of(3, 5, 7, 3, 5, 7, 9), 3)
    );

    @Test
    void test() {
        INPUTS.forEach(socks -> {
            final var result = SalesByMatch.sockMerchant(socks.numberOfPairs, socks.colors);
            assertEquals(socks.result, result);
        });
    }

    private record TestHolder(int numberOfPairs, List<Integer> colors, int result) {
    }

}