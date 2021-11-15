package com.polverini.algorithms.level.easy;

import java.util.HashMap;
import java.util.List;

/**
 * Solution of sales by match problem from HackerRank
 *
 * @see <a href="https://www.hackerrank.com/challenges/sock-merchant/problem">https://www.hackerrank.com/challenges/sock-merchant/problem</a>
 */
final class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        final var map = new HashMap<Integer, Integer>();
        int pairs = 0;
        for (int x : ar) {
            if (!map.containsKey(x)) {
                map.put(x, 1);
                continue;
            }
            pairs++;
            map.remove(x);
        }
        return pairs;
    }
}
