package com.linked_list;

import java.util.NoSuchElementException;

public class SinglyLinkedList {
    private class Node {
        private int value;
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
            last = node;
            size++;
        }
    }

    public void addAt(int index, int item) {
        if(index > size)
            throw new IndexOutOfBoundsException();
        if(index == 0)
            addFirst(item);
        else if(index == size)
            addLast(item);
        else{
            var node = new Node(item);
            int newIndex=0;
            var current = first;
            while (current != null) {
                if (newIndex == index) break;
                current = current.next;
                newIndex++;


            }


            var previous = getPrevious(current);
            previous.next =node;
            node.next = current;
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
            first = node;
            size++;
        }
    }

    private boolean isEmpty() {
        return first == null;
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
        var previous = getPrevious(last);
        last = previous;
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

            var previous = getPrevious(current);

            var second = current.next;
            current.next = null;
            previous.next = second;
            size--;
        }


    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current.next != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public void print() {
        var current = first;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;

        }
    }

    public int getSize() {
        return size;
    }
}
