package com.polverini.algorithms.level.easy;

final class FirstDuplicationV2 implements FirstDuplication {

    @Override
    public int findFirstDuplication(final int[] numbers) {
        for (int x = 0; x < numbers.length; x++) {
            final var idx = Math.abs(numbers[x]) - 1;
            final var currentValue = numbers[idx];
            if (currentValue > 0) {
                return Math.abs(currentValue);
            } else {
                numbers[idx] = -currentValue;
            }
        }
        return -1;
    }

}
