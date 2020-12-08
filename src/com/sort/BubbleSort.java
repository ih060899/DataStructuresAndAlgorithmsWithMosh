package com.sort;

public class BubbleSort<T extends Comparable<? super T>>{
    public void sort(T[] array) {
        for (int i = 0; i < array.length - i; i++) {
            boolean isSorted = true;
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1].compareTo(array[j]) > 0) {
                    swap(array, j, j - 1);
                    isSorted = false;
                }

            }
            if (isSorted)
                return;

        }
    }

    private void swap(T[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
