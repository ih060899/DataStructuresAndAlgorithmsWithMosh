package com.linked_list;

public class Test {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.addLast("Hridoy");
        list.addLast("Imran");
        list.addLast("Tanvir");
        list.addLast("Rahim");
        list.addLast("Mahim");
       // list.remove(100);
        list.addAt(0,"Shafin");
        list.print();
        System.out.println(list.getSize());

    }
}
