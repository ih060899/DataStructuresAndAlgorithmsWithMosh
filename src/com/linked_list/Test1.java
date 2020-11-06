package com.linked_list;

import java.util.LinkedList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add(1,"8");
        System.out.println(list);
    }
}
