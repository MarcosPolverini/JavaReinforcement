package com.polverini.algorithms.sort.bubble;

import com.polverini.algorithms.sort.SortTest;

class BubbleSortTest extends SortTest<BubbleSort> {

    @Override
    public BubbleSort getSortImp() {
        return new BubbleSort();
    }
}