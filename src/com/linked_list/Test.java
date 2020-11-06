package com.linked_list;

public class Test {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(45);
        list.addLast(44);
        list.addLast(43);
        list.addLast(42);
        list.addLast(100);
       // list.remove(100);
        list.addAt(0,300);
        list.print();
        System.out.println(list.getSize());

    }
}
