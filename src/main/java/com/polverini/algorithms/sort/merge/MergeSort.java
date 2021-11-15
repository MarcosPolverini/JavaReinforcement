package com.polverini.algorithms.sort.merge;

import com.polverini.algorithms.sort.Sort;

import static java.lang.System.arraycopy;

final class MergeSort implements Sort {

    @Override
    public void sort(final int[] data) {
        arraycopy(mergeSort(data), 0, data, 0, data.length);
    }

    public int[] mergeSort(int[] data) {
        if (data.length <= 1) {
            return data;
        }
        var middle = data.length / 2;
        var left = copy(data, 0, middle);
        var right = copy(data, left.length, data.length);
        mergeSort(left);
        mergeSort(right);
        merge(left, right, data);
        return data;
    }

    public void merge(int[] left, int[] right, int[] resultData) {
        int idxLeft = 0;
        int idxRight = 0;
        int idxMerge = 0;
        while (idxLeft < left.length && idxRight < right.length) {
            if (left[idxLeft] < right[idxRight]) {
                resultData[idxMerge] = left[idxLeft++];
            } else {
                resultData[idxMerge] = right[idxRight++];
            }
            idxMerge++;
        }
        arraycopy(left, idxLeft, resultData, idxMerge, left.length - idxLeft);
        arraycopy(right, idxRight, resultData, idxMerge, right.length - idxRight);
    }

    private int[] copy(final int[] data, final int from, final int to) {
        final int[] newCopy = new int[to - from];
        arraycopy(data, from, newCopy, 0, newCopy.length);
        return newCopy;
    }


}
