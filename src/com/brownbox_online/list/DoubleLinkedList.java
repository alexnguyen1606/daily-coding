package com.brownbox_online.list;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 2:39 PM ,August 22,2021
 */
public class DoubleLinkedList {

	private Node head;
	private Node tail;

	private int SIZE;

	public DoubleLinkedList() {
		SIZE = 0;
	}

	private static class Node{
		int value;
		Node next;
		Node previous;

		public Node(int value) {
			this.value = value;
		}
	}
	public int get(int index) {
		if (SIZE==0){
			return -1;
		}
		
		int i = 0;
		Node currentNode= head;
		while (currentNode!=null){
			if (i==index){
				return currentNode.value;
			}
			i++;
			currentNode = currentNode.next;
		}
		return -1;
		
	}

	/**
	 * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {
		Node newNode = new Node(val);
		SIZE++;
		if (head==null){
			head = newNode;
			tail = head;
			return;
		}
		newNode.next = head;
		head.previous = newNode;
		head = newNode;
	}

	/**
	 * Append a node of value val to the last element of the linked list.
	 */
	public void addAtTail(int val) {
		Node newNode = new Node(val);
		if (head==null){
			addAtHead(val);
			return;
		}
		SIZE++;
		tail.next = newNode;
		newNode.previous = tail;
		tail = newNode;
	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
	 */
	public void addAtIndex(int index, int val) {
		if (index>SIZE){
			return;
		}
		if (index==SIZE){
			addAtTail(val);
			return;
		}
		if (index ==0){
			addAtHead(val);
			return;
		}
		Node newNode = new Node(val);
		int count = 0;
		Node currentNode = head;
		while (currentNode!=null){
			if (count==index){
				Node preNode = currentNode.previous;
				preNode.next = newNode;
				newNode.previous = preNode;
				newNode.next = currentNode;
				currentNode.previous = newNode;
				SIZE++;
				break;
			}
			count++;
			currentNode = currentNode.next;
		}
	}

	/**
	 * Delete the index-th node in the linked list, if the index is valid.
	 */
	public void deleteAtIndex(int index) {
		if (SIZE==0 || index>=SIZE){
			return;
		}
		int middle = SIZE/2;
		if (middle<index){
			removeFromTail(index);
		}else {
			removeFromHead(index);
		}
		
	}
	
	private void removeFromHead(int index) {
		if (index==0){
			removeAtHead();
			return;
		}
		int count = 0;
		Node currentNode = head;
		while (currentNode!=null){
			if (count==index){
				Node preNode = currentNode.previous;
				preNode.next = currentNode.next;
				currentNode = currentNode.next;
				if (currentNode!=null){
					currentNode.previous = preNode;
				}
				
				SIZE--;
				break;
			}
			count++;
			currentNode = currentNode.next;
		}
	}
	
	private void removeFromTail(int index){
		if (index == SIZE-1){
			removeAtTail();
			return;
		}
		int count = SIZE-1;
		Node currentNode = tail;
		while (currentNode!=null){
			if (count==index){
				Node preNode = currentNode.previous;
				preNode.next = currentNode.next;
				currentNode.previous = preNode;
				SIZE--;
				break;
			}
			count--;
			currentNode = currentNode.previous;
		}
		
	}

	public void removeAtHead(){
		if (SIZE ==0){
			return;
		}
		if (SIZE ==1){
			head = null;
			tail = null;
			return;
		}
		head = head.next;
		head.previous = null;
		SIZE--;
	}
	
	public void removeAtTail(){
		if (SIZE ==0){
			return;
		}
		SIZE--;
		if (size()==1){
			head = null;
			tail = null;
			return;
		}
		Node preNode = tail.previous;
		preNode.next = tail;
		tail = preNode;
	}

	public int size() {
		return SIZE;
	}

	public void print() {

	}

}
