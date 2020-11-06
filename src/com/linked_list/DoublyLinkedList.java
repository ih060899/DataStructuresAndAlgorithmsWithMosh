package com.linked_list;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private class Node {
        private int value;
        private Node previous;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size = 0;

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
            size++;
        } else {
            last.next = node;
            node.previous = last;
            last = node;
            size++;
        }
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
            size++;
        } else {
            node.next = first;
            first.previous = node;
            first = node;
            size++;
        }
    }

    public void addAt(int index, int item) {
        if (index > size)
            throw new IndexOutOfBoundsException();
        if (index == 0)
            addFirst(item);
        else if (index == size)
            addLast(item);
        else {
            var node = new Node(item);
            int newIndex = 0;
            var current = first;
            while (current != null) {
                if (newIndex == index) break;
                current = current.next;
                newIndex++;


            }

            var p = current.previous;
            current.previous = node;
            node.next = current;
            node.previous = p;
            p.next = node;


            size++;

        }
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
            size--;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;
        second.previous = null;
        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
            size--;
            return;
        }

        last = last.previous;
        last.next = null;
        size--;


    }

    public void remove(int item) {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first.value == item)
            removeFirst();
        else if (last.value == item)
            removeLast();
        else {
            var current = first;
            while (current != null) {
                if (current.value == item) break;
                current = current.next;


            }
            if (current==null)
                throw new NoSuchElementException();

            var p = current.previous;
            var n = current.next;
            current.previous = null;
            current.next = null;
            p.next = n;
            n.previous = p;
            size--;
        }


    }

    public void removeAt(int index){

    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;

    }

    public boolean contain(int item) {
        return indexOf(item) != -1;
    }



    private boolean isEmpty(){
        return size == 0;
    }

    public void print() {
        var current = first;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;

        }
    }
}
