package com.brownbox_online.list;

import java.util.*;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 9:27 PM ,August 27,2021
 */
public class LRUCache {
	
	
	private final Integer capacity;
	
	private PriorityQueue<Node> queue = new PriorityQueue<>((o1, o2) -> -Integer.compare(o1.freq,o2.freq));
	private Map<Integer,Node> hashMap = new HashMap<>();
	public LRUCache(int capacity) {
		this.capacity = capacity;
		
		
		
	}
	
	public int get(int key) {
		if (hashMap.containsKey(key)){
			Node node = hashMap.get(key);
			node.freq+=1;
			return node.value;
		}
		return -1;
	}
	
	
	public void put(int key, int value) {
		if (!queue.isEmpty() && queue.size()>=capacity){
			Node maxNode = queue.poll();
			hashMap.remove(maxNode.key);
		}
		Node node;
		if (hashMap.containsKey(key)){
				node = hashMap.get(key);
				node.value = value;
				node.freq+=1;
		}else {
			node = new Node(key,value,1);
			hashMap.put(key,node);
			queue.add(node);
		}
		
		
	}
	
	private static class Node implements Comparable<Node>{
		public Node(int key,int value,int freq) {
			this.value = value;
			this.key = key;
			this.freq = freq;
		}
		
		public Node(int key) {
			this.key = key;
		}
		
		int value;
		int key;
		int freq;
		Node next;
		Node previous;
		
		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Node node = (Node) o;
			return key == node.key;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(key);
		}
		
		@Override
		public int compareTo(Node o) {
			return -Integer.compare(this.freq,o.freq);
		}
	}

  public static void main(String[] args) {
	  LRUCache cache = new LRUCache(2);
	  cache.put(1,1);
	  cache.put(2,2);
    System.out.println(cache.get(2));
    cache.put(4,1);
    cache.get(1);
    cache.get(2);
  }
}
