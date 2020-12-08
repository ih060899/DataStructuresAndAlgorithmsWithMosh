package com.linked_list;

import java.util.NoSuchElementException;

public class DoublyLinkedList<E> {
    private class Node<E> {
        private E value;
        private Node previous;
        private Node next;

        public Node(E value) {
            this.value = value;
        }
    }

    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    public void addLast(E item) {
        var node = new Node<>(item);
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

    public void addFirst(E item) {
        var node = new Node<>(item);
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

    public void addAt(int index, E item) {
        if (index > size)
            throw new IndexOutOfBoundsException();
        if (index == 0)
            addFirst(item);
        else if (index == size)
            addLast(item);
        else {
            var node = new Node<>(item);
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

    public void remove(E item) {
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
            if (current == null)
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

    public void removeAt(int index) {

    }

    public int indexOf(E item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;

    }

    public boolean contain(E item) {
        return indexOf(item) != -1;
    }


    private boolean isEmpty() {
        return size == 0;
    }

    /*public DoublyLinkedList<E> reverse() {
        DoublyLinkedList<E> list = new DoublyLinkedList<>();
        var current = last;
        while (current.previous != null) {
            list.addLast(current.value);
            current = current.previous;
        }
        list.addLast(current.value);
        return list;
    }*/
    public void reverse() {
        var current = last;
        while (current.previous != null) {
            var temp = current.previous;
            current.previous = current.next;
            current.next = temp;

            current = temp;

        }
        var temp = current.previous;
        current.previous = current.next;
        current.next = temp;
        var temp1 = last;
        last = first;
        first = temp1;

    }

    public void print() {
        var current = first;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;

        }
    }
}
