package com.polverini.algorithms.level.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstDuplicationTest {

    private static final List<TestHolder> INPUTS = List.of(
            new TestHolder(new int[]{1, 2, 3, 4, 5, 6, 1}, 1),
            new TestHolder(new int[]{3, 4, 5, 4, 2}, 4)
    );

    @ParameterizedTest
    @MethodSource("streamOfImplementations")
    void executeTest(final FirstDuplication firstDuplication) {
        INPUTS.forEach(holder -> {
            final var result = firstDuplication.findFirstDuplication(holder.inputs);
            assertEquals(holder.result, result);
        });
    }

    private static Stream<FirstDuplication> streamOfImplementations() {
        return Stream.of(
                new FirstDuplicationV1(),
                new FirstDuplicationV2()
        );
    }

    private record TestHolder(int[] inputs, int result) {
    }
}