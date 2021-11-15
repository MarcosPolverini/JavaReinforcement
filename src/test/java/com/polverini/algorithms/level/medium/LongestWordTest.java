package com.polverini.algorithms.level.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestWordTest {

    private static final List<TestHolder> INPUTS = List.of(
            new TestHolder("abcabcaa", 3),
            new TestHolder("bbbbbb", 1),
            new TestHolder("pwwkew", 3),
            new TestHolder("", 0),
            new TestHolder("dvdf", 3),
            new TestHolder("aab", 2)
    );

    @Test
    void test() {
        INPUTS.forEach(holder -> {
            final var result = LongestWord.lengthOfLongestSubstring(holder.input);
            assertEquals(holder.result, result);
        });
    }

    private record TestHolder(String input, int result) {
    }

}