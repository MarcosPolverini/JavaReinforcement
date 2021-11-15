package com.polverini.algorithms.sort.merge;

import com.polverini.algorithms.sort.SortTest;

class MergeSortTest extends SortTest<MergeSort> {

    @Override
    public MergeSort getSortImp() {
        return new MergeSort();
    }
}