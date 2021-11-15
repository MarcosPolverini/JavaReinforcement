package com.polverini.algorithms.level.easy;

import java.util.List;

/**
 * Solution of jumping on the clouds' problem from HackerRank
 *
 * @see <a href="https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem">https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem</a>
 */
final class JumpingOnTheClouds {

    public static int jumpingOnClouds(List<Integer> c) {
        int counter = 0;
        int idx = 0;
        while (idx < c.size() - 1) {
            if (idx + 2 == c.size() || c.get(idx + 2) == 1) {
                idx++;
            } else {
                idx += 2;

            }
            counter++;
        }
        return counter;
    }
}
