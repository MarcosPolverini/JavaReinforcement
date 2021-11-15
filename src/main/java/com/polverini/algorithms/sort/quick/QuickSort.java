package com.polverini.algorithms.sort.quick;

import com.polverini.algorithms.sort.Sort;

public final class QuickSort implements Sort {

    @Override
    public void sort(final int[] data) {
        quickSort(data, 0, data.length - 1);
    }

    private void quickSort(final int[] data, final int low, final int high) {
        int left = low, right = high;
        final int pivot = data[low + (high - low) / 2];

        while (left <= right) {
            while (data[left] < pivot) {
                left++;
            }
            while (data[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(data, left, right);
                left++;
                right--;
            }
        }
        if (low < right) {
            quickSort(data, low, right);
        }
        if (left < high) {
            quickSort(data, left, high);
        }

    }

    private void swap(final int[] data, final int x, final int y) {
        final var xValue = data[x];
        data[x] = data[y];
        data[y] = xValue;
    }
}
