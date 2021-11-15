package com.polverini.algorithms.sort.bubble;

import com.polverini.algorithms.sort.Sort;

final class BubbleSort implements Sort {

    public void sort(final int... data) {
        var swapped = false;
        var lenght = data.length;
        do {
            swapped = false;
            for (int x = 1; x < lenght; ++x) {
                if (data[x - 1] > data[x]) {
                    swap(data, x);
                    swapped = true;
                }
            }
            lenght -= 1;
        } while (swapped && lenght > 1);
    }

    private void swap(final int[] data, final int idx) {
        var xValue = data[idx - 1];
        data[idx - 1] = data[idx];
        data[idx] = xValue;
    }
}
