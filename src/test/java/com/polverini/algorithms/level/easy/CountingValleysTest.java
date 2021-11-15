package com.polverini.algorithms.level.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountingValleysTest {

    private static final List<TestHolder> INPUTS = List.of(
            new TestHolder(12, "DDUUDDUDUUUD", 2),
            new TestHolder(8, "UDDDUDUU", 1),
            new TestHolder(8, "DDUUUUDD", 1),
            new TestHolder(100, "DUDUUUUUUUUDUDDUUDUUDDDUUDDDDDUUDUUUUDDDUUUUUUUDDUDUDUUUDDDDUUDDDUDDDDUUDDUDDUUUDUUUDUUDUDUDDDDDDDDD", 2)
    );


    @Test
    void test() {
        INPUTS.forEach(holder -> {
            final var result = CountingValleys.countingValleys(holder.steps, holder.path);
            assertEquals(holder.result, result);
        });
    }


    private record TestHolder(int steps, String path, int result) {
    }

}