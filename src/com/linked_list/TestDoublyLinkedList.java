package com.linked_list;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<String>();
        list.addLast("Imran");
        list.addLast("Hridoy");
        list.addLast("Shafin");
        list.print();
    }
}
