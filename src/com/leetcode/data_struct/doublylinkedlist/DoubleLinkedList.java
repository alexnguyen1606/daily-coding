package com.leetcode.data_struct.doublylinkedlist;

/**
 * @author:Nguyen Anh Tuan
 *     <p>November 05,2020
 */
public class DoubleLinkedList<T> {
    private class Node {
        private T value;
        private Node next;
        private Node prev;

        private Node(T val) {
            value = val;
        }
    }

    private Node head;
    private Node tail;

    public DoubleLinkedList(T t) {
        head = new Node(t);
    }

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    public void add(T t) {
        Node newNode = new Node(t);
        if (isEmpty()) {
            head = newNode;
            tail = null;
            return;
        }

        if (tail == null) {
            tail = newNode;
            head.next = tail;
            tail.prev = head;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addAtIndex(int index, T val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node currentNode = head;
        int count = 0;
        while (currentNode != null) {
            if (count == index) {
                Node preNode = currentNode.prev;
                Node newNode = new Node(val);
                preNode.next = newNode;
                newNode.next = currentNode;
                newNode.prev = preNode;
                currentNode.prev = newNode;
                return;
            }
            count++;
            currentNode = currentNode.next;
        }
    }

    public T get(Integer i) {
        int count = 0;
        Node currentNode = head;
        while (currentNode != null) {
            if (count == i) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public void addAtHead(T val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void deleteAtIndex(Integer index) {
        if (isEmpty()) {
            return;
        }
        int count = 0;
        Node currentNode = head;
        while (currentNode != null) {
            if (count == index && index == 0) {
                if (currentNode.next == null) {
                    head = null;
                } else {
                    head = currentNode.next;
                    head.prev = null;
                }
                return;
            } else if (count == index) {
                Node preNode = currentNode.prev;
                if (currentNode.next == null) {
                    preNode.next = null;
                    currentNode.prev = null;
                } else {
                    Node nextNode = currentNode.next;
                    preNode.next = nextNode;
                    nextNode.prev = preNode;
                }
                return;
            }
            count++;
            currentNode = currentNode.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(",");
            }
            current = current.next;
        }
        System.out.println();
    }


}
