package com.polverini.algorithms.level.hard;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Solution of nailing planks problem from Codility
 *
 * @see <a href="https://app.codility.com/programmers/lessons/14-binary_search_algorithm/nailing_planks/">https://app.codility.com/programmers/lessons/14-binary_search_algorithm/nailing_planks</a>
 */
final class NailingPlanks {

    public static int solution(int[] A, int[] B, int[] C) {
        // will add the number of nails and the index
        int[][] nails = new int[C.length][2];
        for (int i = 0; i < C.length; i++) {
            nails[i][0] = C[i];
            nails[i][1] = i;
        }
        //Sort by number of nails
        Arrays.sort(nails, Comparator.comparingInt((int[] a) -> a[0]));
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result = getMinIdx(A[i], B[i], nails, result);
            if (result == -1) {
                return -1;
            }
        }
        return result + 1;
    }

    private static int getMinIdx(int start, int end, int[][] nails, int lastResult) {
        int min = 0;
        int max = nails.length;
        int minIdx = -1;
        while (min <= max) {
            int middle = (min + max) / 2;
            //Go left
            if (nails[middle][0] < start)
                min = middle + 1;
                //Go right
            else if (nails[middle][0] > end)
                max = middle - 1;
            else {
                max = middle - 1;
                minIdx = middle;
            }
        }
        if (minIdx == -1)
            return -1;
        int minOrigin = nails[minIdx][1];
        for (int i = minIdx; i < nails.length; i++) {
            if (nails[i][0] > end)
                break;
            minOrigin = Math.min(minOrigin, nails[i][1]);
            if (minOrigin <= lastResult)
                return lastResult;
        }
        return minOrigin;

    }

}
