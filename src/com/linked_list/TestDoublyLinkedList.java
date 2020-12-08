package com.linked_list;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.addLast("Imran");
        list.addLast("Hridoy");
        list.addLast("Shafin");
        list.addLast("Mahim");
        list.addFirst("Tanvir");
        list.addLast("Rahim");
        list.addLast("Karim");
        list.print();
        System.out.println("After Reverse : ");
        list.reverse();
        list.print();

        DoublyLinkedList<Integer> list1 = new DoublyLinkedList<>();
        for (int i = 1; i < 100; i++) {
            list1.addLast(i);

        }
        list1.reverse();
        list1.print();
        System.out.println("After....");
        list1.reverse();
        list1.print();
    }
}
