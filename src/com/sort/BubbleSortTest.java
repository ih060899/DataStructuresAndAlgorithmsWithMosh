package com.sort;

import java.util.Arrays;

public class BubbleSortTest {
    public static void main(String[] args) {
        Integer[] numbers = {100, 45, 40, 33, 23, 19, 17, 16, 20, 71};
        BubbleSort<Integer> sorter = new BubbleSort<>();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] names = {"Andree", "Leana", "Faviola", "Loyce", "Quincy", "Milo", "Jamila", "Toccara", "Nelda", "Blair", "Ernestine", "Chara", "Kareen", "Monty", "Rene", "Cami", "Winifred", "Tara", "Demetrice", "Azucena"};
        BubbleSort<String> stringSorter = new BubbleSort<>();
        stringSorter.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
