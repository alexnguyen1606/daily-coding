package com.brownbox_online.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:Nguyen Anh Tuan
 *     <p>12:19 AM ,September 11,2021
 */
public class FindTheDuplicateNumber_287 {

  class Node implements Comparable<Node> {
    int key;
    int feq;
    public Node(int key, int feq) {
      this.key = key;
      this.feq = feq;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Node node = (Node) o;
      return key == node.key;
    }

    @Override
    public int compareTo(Node o) {
      return -Integer.compare(this.feq, o.feq);
    }
  }

  public int findDuplicate(int[] nums) {
    Map<Integer, Integer> hash = new HashMap<>();

    for (int num : nums) {
      if (hash.containsKey(num)) {
        hash.put(num, hash.get(num) + 1);
      } else {
        hash.put(num, 1);
      }
    }
    for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
      if (entry.getValue() > 1) {
        return entry.getKey();
      }
    }
    return -1;
  }
  
  public int findDuplicate2(int[] nums) {
    boolean[] hash = new boolean[nums.length+1];
    for (int num : nums) {
      if (hash[num]) {
        return num;
      }
      hash[num] = true;
    }
    return -1;
  }
}
