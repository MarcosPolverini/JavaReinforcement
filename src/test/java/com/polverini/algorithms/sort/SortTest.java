package com.polverini.algorithms.sort;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public abstract class SortTest<T extends Sort> {

    @Test
    void should_sort_simple_value() {
        var expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        var data = new int[]{9, 8, 7, 4, 6, 5, 1, 2, 3};
        getSortImp().sort(data);
        assertArrayEquals(expected, data);
    }

    @Test
    void should_sort_big_value() {
        var expected = IntStream.rangeClosed(1, 1000).toArray();
        var listData = IntStream.of(expected).boxed().collect(toList());
        Collections.shuffle(listData);
        var data = listData.stream().mapToInt(i -> i).toArray();
        getSortImp().sort(data);
        assertArrayEquals(expected, data);
    }

    public abstract T getSortImp();
}
