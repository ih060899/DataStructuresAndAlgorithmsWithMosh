package com.linked_list;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast(45);
        list.addLast(44);
        list.addLast(43);
        list.addLast(42);
        list.addLast(100);

        list.addAt(0,300);
//        list.addFirst(300);
//        list.remove(42);

//        System.out.println(list.contain(301));
//
//        System.out.println(list.indexOf(100));
    }
}
