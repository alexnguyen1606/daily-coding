package com.leetcode.data_struct.stackandqueue;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 1:47 PM ,August 05,2021
 */
public class MyLinkedListStack implements IStackAndQueue {

	private class Node{
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	private Node topNode;

	public MyLinkedListStack() {
		this.topNode = null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return topNode == null;
	}

	@Override
	public boolean push(int value) {
		Node node = new Node(value);
		node.next = topNode;
		topNode = node;
		return false;
	}

	@Override
	public int pop() throws Exception {
		if (isEmpty()){
			throw new Exception("Kho có phan tư");
		}
		Node value  = topNode;
		topNode = topNode.next;
		return value.value;
	}

	@Override
	public void show() {
		Node tempNode = topNode;
		while (tempNode!=null){
			System.out.print(tempNode.value);
			tempNode = tempNode.next;
		}
		System.out.println();
	}

	public static void main(String[] args) throws Exception {
		MyLinkedListStack stack = new MyLinkedListStack();
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		stack.show();
		stack.show();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}
}
