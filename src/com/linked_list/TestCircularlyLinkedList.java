package com.linked_list;

public class TestCircularlyLinkedList {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> list = new CircularlyLinkedList<>();
        list.addFirst(34);
        list.addFirst(100);
        list.addFirst(56);
        list.addFirst(51);
        list.addLast(33);
        //list.removeFirst();
        list.rotate();
        list.rotate();
//        list.rotate();
//        list.rotate();

        System.out.println(list.last());

    }
}
