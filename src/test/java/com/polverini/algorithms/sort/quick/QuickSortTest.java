package com.polverini.algorithms.sort.quick;

import com.polverini.algorithms.sort.SortTest;

public class QuickSortTest extends SortTest<QuickSort> {

    @Override
    public QuickSort getSortImp() {
        return new QuickSort();
    }
}