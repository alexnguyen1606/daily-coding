//package com.brownbox_online.list;
//
///**
// * @author:Nguyen Anh Tuan
// * <p>
// * 2:39 PM ,August 22,2021
// */
//public class DoubleLinkedList {
//
//	private Node head;
//	private Node tail;
//
//	private int SIZE;
//
//	public DoubleLinkedList() {
//		SIZE = 0;
//	}
//
//	private static class Node{
//		int value;
//		Node next;
//		Node previous;
//
//		public Node(int value) {
//			this.value = value;
//		}
//	}
//	public int get(int index) {
//
//	}
//
//	/**
//	 * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
//	 */
//	public void addAtHead(int val) {
//		Node newNode = new Node(val);
//		SIZE++;
//		if (head==null){
//			head = newNode;
//			tail = head;
//			return;
//		}
//		newNode.next = head;
//		head.previous = newNode;
//		head = newNode;
//	}
//
//	/**
//	 * Append a node of value val to the last element of the linked list.
//	 */
//	public void addAtTail(int val) {
//		Node newNode = new Node(val);
//		SIZE++;
//		if (head==null){
//			addAtHead(val);
//			return;
//		}
//		tail.next = newNode;
//		newNode.previous = tail;
//		tail = newNode;
//	}
//
//	/**
//	 * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
//	 */
//	public void addAtIndex(int index, int val) {
//		SIZE++;
//		if (index ==0){
//			addAtHead(val);
//			return;
//		}
//		Node newNode = new Node(val);
//		int count = 0;
//		Node currentNode = head;
//		while (currentNode!=null){
//
//			count++;
//			currentNode = currentNode.next;
//		}
//	}
//
//	/**
//	 * Delete the index-th node in the linked list, if the index is valid.
//	 */
//	public void deleteAtIndex(int index) {
//		SIZE--;
//	}
//
//	public void removeAtHead(){
//		if (SIZE ==0){
//			return;
//		}
//		if (SIZE ==1){
//			head = null;
//			tail = null;
//			return;
//		}
//		head = head.next;
//		head.previous = null;
//		SIZE--;
//
//	}
//
//	public int size() {
//		return SIZE;
//	}
//
//	public void print() {
//
//	}
//
//}
