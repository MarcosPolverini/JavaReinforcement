package com.polverini.algorithms.level.easy;

/**
 * Solution of counting valleys problem from HackerRank
 *
 * @see <a href="https://www.hackerrank.com/challenges/counting-valleys/problem">https://www.hackerrank.com/challenges/counting-valleys/problem</a>
 */
final class CountingValleys {

    public static int countingValleys(int steps, String path) {
        int currentLevel = 0;
        int minLevel = 0;
        int valleys = 0;
        for (final char p : path.toCharArray()) {
            currentLevel += 'U' == p ? 1 : -1;
            minLevel = Math.min(currentLevel, minLevel);
            if (currentLevel == 0 && minLevel < 0) {
                valleys++;
                minLevel = 0;
            }
        }
        return valleys;
    }

}
