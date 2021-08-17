package com.brownbox_online.list;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 8:47 AM ,August 14,2021
 */
public class MyLinkedList {

	private Node head;
	private Node tail;
	private int SIZE;



	/**
	 * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
	 */
	public int get(int index) {
		Node fastNode = this.head;
		int count = 0;
		while (fastNode != null) {
			if (count == index ) {
				return fastNode.value;
			}
			count++;
			fastNode = fastNode.next;
		}
		return -1;
	}

	/**
	 * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {
		Node newNode = new Node(val);
		newNode.next = this.head;
		this.head = newNode;
		if (this.tail == null) {
			this.tail = newNode;
		}
		SIZE++;
	}

	/**
	 * Append a node of value val to the last element of the linked list.
	 */
	public void addAtTail(int val) {
		Node newNode = new Node(val);
		if (this.tail == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.tail.next = newNode;
			this.tail = newNode;
		}
		SIZE++;

	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
	 */
	public void addAtIndex(int index, int val) {
		int count = 0;
		if (index == count){
			addAtHead(val);
			return;
		}
		if (index == size()){
			addAtTail(val);
			return;
		}
		Node fast = this.head;
		Node slow = null;
		while (fast != null ) {
			if (count == index ) {
				Node newNode = new Node(val);
				slow.next = newNode;
				newNode.next = fast;
				SIZE++;
				return;
			}
			slow = fast;
			fast = fast.next;
			
			count++;
		}
	}

	/**
	 * Delete the index-th node in the linked list, if the index is valid.
	 */
	public void deleteAtIndex(int index) {
		if (index == size() || index<0){
			return;
		}
		if (index==0 && head!=null){
			removeAtHead();
			return;
		}

		Node fast = this.head;
		Node slow = null;
		int count = 0;
		while (fast!=null){
			if (count == index){
				slow.next = fast.next;
				if (slow.next==null){
					tail = slow;
				}
				SIZE--;
				return;
			}
			slow = fast;
			fast = fast.next;
			count++;
		}
	}
	
	public void removeAtHead(){
		if (head!=null){
			head = head.next;
			if (SIZE==1){
				tail = null;
			}
			SIZE--;
		}
	}

	public int size() {
		return SIZE;
	}

	public void print() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.value);
			temp = temp.next;
			if (temp != null) {
				System.out.print("->");
			} else {
				System.out.println();
			}
		}
	}

	public void print(MyLinkedList myLinkedList) {
		Node temp = myLinkedList.head;
		while (temp != null) {
			System.out.print(temp.value);
			temp = temp.next;
			if (temp != null) {
				System.out.print("->");
			} else {
				System.out.println();
			}
		}
	}

	static class Node {
		int value;
		private Node next;


		public Node(int value) {
			this.value = value;
		}
	}
	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addAtHead(1);
		myLinkedList.addAtTail(3);
		myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
		myLinkedList.print();
    System.out.println(myLinkedList.get(0) ); // return 2
    System.out.println(myLinkedList.get(1) ); // return 2
    System.out.println(myLinkedList.get(2) ); // return 2
		myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
		myLinkedList.get(1);
		myLinkedList.print();

	}
}
