package com.polverini.algorithms.level.easy;

import java.util.HashMap;

/**
 * Solution of two sum problem from HackerRank
 *
 * @see <a href="https://leetcode.com/problems/two-sum/">https://leetcode.com/problems/two-sum</a>
 */
final class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        final var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[0];
    }
}
