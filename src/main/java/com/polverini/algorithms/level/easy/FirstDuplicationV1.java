package com.polverini.algorithms.level.easy;

import java.util.HashSet;

final class FirstDuplicationV1 implements FirstDuplication {

    @Override
    public int findFirstDuplication(final int[] numbers) {
        var seen = new HashSet<Integer>();
        for (final var number : numbers) {
            if (seen.contains(number)) {
                return number;
            }
            seen.add(number);
        }
        return -1;
    }

}
