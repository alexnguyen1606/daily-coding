package com.brownbox_online.list;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:Nguyen Anh Tuan
 *     <p>9:27 PM ,August 27,2021
 */
public class LRUCache {
  private final Integer capacity;
  private final MinHeap minHeap;
  private Map<Integer, Node> hashMap = new HashMap<>();

  public LRUCache(int capacity) {
    this.capacity = capacity;
    minHeap = new MinHeap(capacity);
  }

  private static class MinHeap {
    private int size;
    private final Node[] array;
    private final int MAX_SIZE;
    private int max_freq;

    public MinHeap(int MAX_SIZE) {
      this.MAX_SIZE = MAX_SIZE;
      array = new Node[MAX_SIZE + 1];
    }

    boolean isEmpty() {
      return size == 0;
    }

    Node peek() {
      if (isEmpty()) {
        return null;
      }
      return array[1];
    }

    Node poll() {
      if (isEmpty()) {
        return null;
      }
      Node resultNode = array[1];
      array[1] = array[size];
      array[1].index = 1;
      size--;
      heapifyDown(1);
      return resultNode;
    }

    void add(Node node) {
      if (size == MAX_SIZE) {
        return;
      }
      if (node.freq > max_freq) {
        max_freq = node.freq;
      }
      node.freq = max_freq;
      size++;
      array[size] = node;
      node.index = size;
      heapifyUp(size);
    }

    void heapifyDown(int i) {
      if (array[i].freq > max_freq) {
        max_freq = array[i].freq;
      }
      int iLeft, iRight, smallerIndex;
      while ((i * 2) <= size) {
        iLeft = i * 2;
        iRight = iLeft + 1;
        smallerIndex = iLeft;
        if (iRight <= size && array[iRight].freq < array[smallerIndex].freq) {
          smallerIndex = iRight;
        }
        if (array[smallerIndex].freq < array[i].freq) {
          swap(smallerIndex, i);
          i = smallerIndex;
        } else {
          break;
        }
      }
    }

    void heapifyUp(int i) {

      int parent = i / 2;
      while (parent != 0 && array[i].freq < array[parent].freq) {
        swap(i, parent);
        i = parent;
        parent = i / 2;
      }
    }

    void swap(int i, int j) {
      array[i].index = j;
      array[j].index = i;
      Node temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }
  }

  public int get(int key) {
    if (hashMap.containsKey(key)) {
      Node node = hashMap.get(key);
      node.freq += 1;
      minHeap.heapifyDown(node.index);
      return node.value;
    }
    return -1;
  }

  public void put(int key, int value) {
    Node node;
    if (hashMap.containsKey(key)) {
      node = hashMap.get(key);
      node.value = value;
      node.freq += 1;
      minHeap.heapifyDown(node.index);
      return;
    }
    if (!minHeap.isEmpty() && hashMap.size() >= capacity) {
      node = minHeap.poll();
      hashMap.remove(node.key);
    }

    node = new Node(key, value, 1);
    hashMap.put(key, node);
    minHeap.add(node);
  }

  private static class Node {
    public Node(int key, int value, int freq) {
      this.value = value;
      this.key = key;
      this.freq = freq;
    }

    public Node(int key) {
      this.key = key;
    }

    int index;
    int freq;
    int value;
    int key;
  }

  public static void main(String[] args) {
    LRUCache cache = new LRUCache(2);
    cache.put(1, 1);
    cache.put(2, 2);
    System.out.println(cache.get(1));
    cache.put(3, 3);
    System.out.println(cache.get(2));
    cache.put(4, 4);
    System.out.println(cache.get(1));
    System.out.println(cache.get(3));
    System.out.println(cache.get(4));
  }
}
