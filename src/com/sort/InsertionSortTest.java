package com.sort;

import java.util.Arrays;

public class InsertionSortTest {
    public static void main(String[] args) {
        int[] numbers = {56,77,45,12,34,66,55};
        var sorter = new InsertionSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
