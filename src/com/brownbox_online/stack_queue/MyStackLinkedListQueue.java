package com.brownbox_online.stack_queue;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:26 PM ,August 17,2021
 */
public class MyStackLinkedListQueue implements IStackQueue {
    private final int SIZE;
    private int count;
    private Node head;
    private Node tail;
    
    static class Node{
        int value;
        Node next;
    
        Node(int value) {
            this.value = value;
        }
    }
    public MyStackLinkedListQueue(int SIZE) {
        this.SIZE = SIZE;
    }
    
    @Override
    public int pop() {
        if (isEmpty()){
            return 0;
        }
        Node temp = head;
        head = temp.next;
        if (head==null){
            tail = null;
        }
        count--;
        return temp.value;
    }
    
    @Override
    public boolean push(int value) {
        if (isFull()){
            return false;
        }
        Node newNode = new Node(value);
        if (isEmpty()){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
        return true;
    }
    
    @Override
    public boolean isFull() {
        return count==SIZE;
    }
    
    @Override
    public boolean isEmpty() {
        return count==0;
    }
    
    @Override
    public int size() {
        return count;
    }
    
    @Override
    public void print() {
    
    }
}
