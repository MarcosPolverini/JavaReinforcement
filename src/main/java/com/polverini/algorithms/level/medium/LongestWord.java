package com.polverini.algorithms.level.medium;

import java.util.HashSet;
import java.util.stream.Stream;

/**
 * Solution of longest' substring without repeating characters problem from LeetCode
 *
 * @see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters">https://leetcode.com/problems/longest-substring-without-repeating-characters</a>
 */
final class LongestWord {

    public static int lengthOfLongestSubstring(String s) {
        final var letters = new HashSet<Character>();
        final var charArray = s.toCharArray();
        int previous = 0;
        int max = 0;

        for (int x = 0; x < charArray.length; x++) {
            if (letters.add(charArray[x])) {
                max = Math.max(letters.size(), max);
            } else {
                letters.remove(charArray[previous++]);
                x--;
            }
        }
        return max;
    }
    
}
